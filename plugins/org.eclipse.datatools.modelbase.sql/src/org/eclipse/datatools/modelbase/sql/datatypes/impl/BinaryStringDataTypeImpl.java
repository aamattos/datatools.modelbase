/*******************************************************************************
 * Copyright (c) 2001, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.modelbase.sql.datatypes.impl;

import java.util.Collection;

import org.eclipse.datatools.modelbase.sql.datatypes.BinaryStringDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.PrimitiveType;
import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary String Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.BinaryStringDataTypeImpl#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryStringDataTypeImpl extends PredefinedDataTypeImpl implements BinaryStringDataType {
	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryStringDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SQLDataTypesPackage.eINSTANCE.getBinaryStringDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean equals() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__DEPENDENCIES:
					return ((InternalEList)getDependencies()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__EANNOTATIONS:
				return getEAnnotations();
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__NAME:
				return getName();
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__DEPENDENCIES:
				return getDependencies();
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__DESCRIPTION:
				return getDescription();
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__LABEL:
				return getLabel();
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__PRIMITIVE_TYPE:
				return getPrimitiveType();
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__LENGTH:
				return new Integer(getLength());
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__NAME:
				setName((String)newValue);
				return;
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection)newValue);
				return;
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__LABEL:
				setLabel((String)newValue);
				return;
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__PRIMITIVE_TYPE:
				setPrimitiveType((PrimitiveType)newValue);
				return;
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__LENGTH:
				setLength(((Integer)newValue).intValue());
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__DEPENDENCIES:
				getDependencies().clear();
				return;
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__PRIMITIVE_TYPE:
				setPrimitiveType(PRIMITIVE_TYPE_EDEFAULT);
				return;
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__PRIMITIVE_TYPE:
				return primitiveType != PRIMITIVE_TYPE_EDEFAULT;
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE__LENGTH:
				return length != LENGTH_EDEFAULT;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (length: "); //$NON-NLS-1$
		result.append(length);
		result.append(')');
		return result.toString();
	}

} //BinaryStringDataTypeImpl