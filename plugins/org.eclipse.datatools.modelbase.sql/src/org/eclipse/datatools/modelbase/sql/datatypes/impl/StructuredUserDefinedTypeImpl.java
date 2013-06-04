/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.datatypes.impl;

import org.eclipse.datatools.modelbase.sql.datatypes.AttributeDefinition;
import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage;
import org.eclipse.datatools.modelbase.sql.datatypes.StructuredUserDefinedType;
import org.eclipse.datatools.modelbase.sql.routines.Method;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured User Defined Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.StructuredUserDefinedTypeImpl#isInstantiable <em>Instantiable</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.StructuredUserDefinedTypeImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.StructuredUserDefinedTypeImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.StructuredUserDefinedTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.StructuredUserDefinedTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.StructuredUserDefinedTypeImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredUserDefinedTypeImpl extends UserDefinedTypeImpl implements StructuredUserDefinedType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredUserDefinedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLDataTypesPackage.Literals.STRUCTURED_USER_DEFINED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInstantiable() {
		return (Boolean)eGet(SQLDataTypesPackage.Literals.STRUCTURED_USER_DEFINED_TYPE__INSTANTIABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiable(boolean newInstantiable) {
		eSet(SQLDataTypesPackage.Literals.STRUCTURED_USER_DEFINED_TYPE__INSTANTIABLE, newInstantiable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
		return (Boolean)eGet(SQLDataTypesPackage.Literals.STRUCTURED_USER_DEFINED_TYPE__FINAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		eSet(SQLDataTypesPackage.Literals.STRUCTURED_USER_DEFINED_TYPE__FINAL, newFinal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredUserDefinedType getSuper() {
		return (StructuredUserDefinedType)eGet(SQLDataTypesPackage.Literals.STRUCTURED_USER_DEFINED_TYPE__SUPER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuper(StructuredUserDefinedType newSuper) {
		eSet(SQLDataTypesPackage.Literals.STRUCTURED_USER_DEFINED_TYPE__SUPER, newSuper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StructuredUserDefinedType> getSub() {
		return (EList<StructuredUserDefinedType>)eGet(SQLDataTypesPackage.Literals.STRUCTURED_USER_DEFINED_TYPE__SUB, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AttributeDefinition> getAttributes() {
		return (EList<AttributeDefinition>)eGet(SQLDataTypesPackage.Literals.STRUCTURED_USER_DEFINED_TYPE__ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Method> getMethods() {
		return (EList<Method>)eGet(SQLDataTypesPackage.Literals.STRUCTURED_USER_DEFINED_TYPE__METHODS, true);
	}

} //StructuredUserDefinedTypeImpl
