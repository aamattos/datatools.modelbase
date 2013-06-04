/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.schema.impl;

import java.math.BigInteger;

import org.eclipse.datatools.modelbase.sql.schema.GenerateType;
import org.eclipse.datatools.modelbase.sql.schema.IdentitySpecifier;
import org.eclipse.datatools.modelbase.sql.schema.SQLSchemaPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity Specifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.IdentitySpecifierImpl#getGenerationType <em>Generation Type</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.IdentitySpecifierImpl#getStartValue <em>Start Value</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.IdentitySpecifierImpl#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.IdentitySpecifierImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.IdentitySpecifierImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.IdentitySpecifierImpl#isCycleOption <em>Cycle Option</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentitySpecifierImpl extends SQLObjectImpl implements IdentitySpecifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentitySpecifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLSchemaPackage.Literals.IDENTITY_SPECIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerateType getGenerationType() {
		return (GenerateType)eGet(SQLSchemaPackage.Literals.IDENTITY_SPECIFIER__GENERATION_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerationType(GenerateType newGenerationType) {
		eSet(SQLSchemaPackage.Literals.IDENTITY_SPECIFIER__GENERATION_TYPE, newGenerationType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStartValue() {
		return (BigInteger)eGet(SQLSchemaPackage.Literals.IDENTITY_SPECIFIER__START_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartValue(BigInteger newStartValue) {
		eSet(SQLSchemaPackage.Literals.IDENTITY_SPECIFIER__START_VALUE, newStartValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getIncrement() {
		return (BigInteger)eGet(SQLSchemaPackage.Literals.IDENTITY_SPECIFIER__INCREMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrement(BigInteger newIncrement) {
		eSet(SQLSchemaPackage.Literals.IDENTITY_SPECIFIER__INCREMENT, newIncrement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinimum() {
		return (BigInteger)eGet(SQLSchemaPackage.Literals.IDENTITY_SPECIFIER__MINIMUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(BigInteger newMinimum) {
		eSet(SQLSchemaPackage.Literals.IDENTITY_SPECIFIER__MINIMUM, newMinimum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaximum() {
		return (BigInteger)eGet(SQLSchemaPackage.Literals.IDENTITY_SPECIFIER__MAXIMUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum(BigInteger newMaximum) {
		eSet(SQLSchemaPackage.Literals.IDENTITY_SPECIFIER__MAXIMUM, newMaximum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCycleOption() {
		return (Boolean)eGet(SQLSchemaPackage.Literals.IDENTITY_SPECIFIER__CYCLE_OPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCycleOption(boolean newCycleOption) {
		eSet(SQLSchemaPackage.Literals.IDENTITY_SPECIFIER__CYCLE_OPTION, newCycleOption);
	}

} //IdentitySpecifierImpl
