/*******************************************************************************
 * Copyright (c) 2021 Obeo.
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
package org.eclipse.sirius.web.view.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.sirius.web.view.Style;
import org.eclipse.sirius.web.view.ViewPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Style</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.sirius.web.view.impl.StyleImpl#getColor <em>Color</em>}</li>
 * <li>{@link org.eclipse.sirius.web.view.impl.StyleImpl#getBorderColor <em>Border Color</em>}</li>
 * <li>{@link org.eclipse.sirius.web.view.impl.StyleImpl#getFontSize <em>Font Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StyleImpl extends MinimalEObjectImpl.Container implements Style {
    /**
     * The default value of the '{@link #getColor() <em>Color</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getColor()
     * @generated
     * @ordered
     */
    protected static final String COLOR_EDEFAULT = "rgb(0, 0, 0)"; //$NON-NLS-1$

    /**
     * The cached value of the '{@link #getColor() <em>Color</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getColor()
     * @generated
     * @ordered
     */
    protected String color = COLOR_EDEFAULT;

    /**
     * The default value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getBorderColor()
     * @generated
     * @ordered
     */
    protected static final String BORDER_COLOR_EDEFAULT = "rgb(0, 0, 0)"; //$NON-NLS-1$

    /**
     * The cached value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getBorderColor()
     * @generated
     * @ordered
     */
    protected String borderColor = BORDER_COLOR_EDEFAULT;

    /**
     * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getFontSize()
     * @generated
     * @ordered
     */
    protected static final int FONT_SIZE_EDEFAULT = 14;

    /**
     * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getFontSize()
     * @generated
     * @ordered
     */
    protected int fontSize = FONT_SIZE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected StyleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ViewPackage.Literals.STYLE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getColor() {
        return this.color;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setColor(String newColor) {
        String oldColor = this.color;
        this.color = newColor;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.STYLE__COLOR, oldColor, this.color));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getBorderColor() {
        return this.borderColor;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setBorderColor(String newBorderColor) {
        String oldBorderColor = this.borderColor;
        this.borderColor = newBorderColor;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.STYLE__BORDER_COLOR, oldBorderColor, this.borderColor));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getFontSize() {
        return this.fontSize;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFontSize(int newFontSize) {
        int oldFontSize = this.fontSize;
        this.fontSize = newFontSize;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.STYLE__FONT_SIZE, oldFontSize, this.fontSize));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case ViewPackage.STYLE__COLOR:
            return this.getColor();
        case ViewPackage.STYLE__BORDER_COLOR:
            return this.getBorderColor();
        case ViewPackage.STYLE__FONT_SIZE:
            return this.getFontSize();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case ViewPackage.STYLE__COLOR:
            this.setColor((String) newValue);
            return;
        case ViewPackage.STYLE__BORDER_COLOR:
            this.setBorderColor((String) newValue);
            return;
        case ViewPackage.STYLE__FONT_SIZE:
            this.setFontSize((Integer) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case ViewPackage.STYLE__COLOR:
            this.setColor(COLOR_EDEFAULT);
            return;
        case ViewPackage.STYLE__BORDER_COLOR:
            this.setBorderColor(BORDER_COLOR_EDEFAULT);
            return;
        case ViewPackage.STYLE__FONT_SIZE:
            this.setFontSize(FONT_SIZE_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case ViewPackage.STYLE__COLOR:
            return COLOR_EDEFAULT == null ? this.color != null : !COLOR_EDEFAULT.equals(this.color);
        case ViewPackage.STYLE__BORDER_COLOR:
            return BORDER_COLOR_EDEFAULT == null ? this.borderColor != null : !BORDER_COLOR_EDEFAULT.equals(this.borderColor);
        case ViewPackage.STYLE__FONT_SIZE:
            return this.fontSize != FONT_SIZE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (this.eIsProxy())
            return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (color: "); //$NON-NLS-1$
        result.append(this.color);
        result.append(", borderColor: "); //$NON-NLS-1$
        result.append(this.borderColor);
        result.append(", fontSize: "); //$NON-NLS-1$
        result.append(this.fontSize);
        result.append(')');
        return result.toString();
    }

} // StyleImpl
