/*******************************************************************************
 * Copyright (c) 2019, 2021 Obeo.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.web.spring.collaborative.projects;

import java.util.Objects;
import java.util.Optional;

import org.eclipse.sirius.web.collaborative.api.services.ChangeDescription;
import org.eclipse.sirius.web.collaborative.api.services.ChangeKind;
import org.eclipse.sirius.web.collaborative.api.services.EventHandlerResponse;
import org.eclipse.sirius.web.collaborative.api.services.IEditingContextEventHandler;
import org.eclipse.sirius.web.core.api.ErrorPayload;
import org.eclipse.sirius.web.core.api.IEditingContext;
import org.eclipse.sirius.web.core.api.IInput;
import org.eclipse.sirius.web.services.api.projects.IProjectService;
import org.eclipse.sirius.web.services.api.projects.Project;
import org.eclipse.sirius.web.services.api.projects.RenameProjectInput;
import org.eclipse.sirius.web.services.api.projects.RenameProjectSuccessPayload;
import org.eclipse.sirius.web.spring.collaborative.messages.ICollaborativeMessageService;
import org.springframework.stereotype.Service;

/**
 * Handler used to rename a project.
 *
 * @author fbarbin
 */
@Service
public class RenameProjectEventHandler implements IEditingContextEventHandler {

    private final ICollaborativeMessageService messageService;

    private final IProjectService projectService;

    public RenameProjectEventHandler(ICollaborativeMessageService messageService, IProjectService projectService) {
        this.messageService = Objects.requireNonNull(messageService);
        this.projectService = Objects.requireNonNull(projectService);
    }

    @Override
    public boolean canHandle(IInput input) {
        return input instanceof RenameProjectInput;
    }

    @Override
    public EventHandlerResponse handle(IEditingContext editingContext, IInput input) {
        if (input instanceof RenameProjectInput) {
            RenameProjectInput renameProjectInput = (RenameProjectInput) input;
            Optional<Project> optionalProject = this.projectService.renameProject(renameProjectInput.getProjectId(), renameProjectInput.getNewName());
            if (optionalProject.isPresent()) {
                RenameProjectSuccessPayload payload = new RenameProjectSuccessPayload(input.getId(), optionalProject.get());
                return new EventHandlerResponse(new ChangeDescription(ChangeKind.PROJECT_RENAMING, editingContext.getId()), payload);
            }
        }
        String message = this.messageService.invalidInput(input.getClass().getSimpleName(), RenameProjectInput.class.getSimpleName());
        return new EventHandlerResponse(new ChangeDescription(ChangeKind.NOTHING, editingContext.getId()), new ErrorPayload(input.getId(), message));
    }

}
