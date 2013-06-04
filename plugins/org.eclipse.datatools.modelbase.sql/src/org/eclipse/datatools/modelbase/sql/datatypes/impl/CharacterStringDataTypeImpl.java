/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.datatypes.impl;

import org.eclipse.datatools.modelbase.sql.datatypes.CharacterSet;
import org.eclipse.datatools.modelbase.sql.datatypes.CharacterStringDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.CoercibilityType;
import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character String Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.CharacterStringDataTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.CharacterStringDataTypeImpl#getCoercibility <em>Coercibility</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.CharacterStringDataTypeImpl#isFixedLength <em>Fixed Length</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.CharacterStringDataTypeImpl#getCollationName <em>Collation Name</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.CharacterStringDataTypeImpl#getCharacterSet <em>Character Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CharacterStringDataTypeImpl extends PredefinedDataTypeImpl implements CharacterStringDataType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterStringDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLDataTypesPackage.Literals.CHARACTER_STRING_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return (Integer)eGet(SQLDataTypesPackage.Literals.CHARACTER_STRING_DATA_TYPE__LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		eSet(SQLDataTypesPackage.Literals.CHARACTER_STRING_DATA_TYPE__LENGTH, newLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFixedLength() {
		return (Boolean)eGet(SQLDataTypesPackage.Literals.CHARACTER_STRING_DATA_TYPE__FIXED_LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedLength(boolean newFixedLength) {
		eSet(SQLDataTypesPackage.Literals.CHARACTER_STRING_DATA_TYPE__FIXED_LENGTH, newFixedLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCollationName() {
		return (String)eGet(SQLDataTypesPackage.Literals.CHARACTER_STRING_DATA_TYPE__COLLATION_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollationName(String newCollationName) {
		eSet(SQLDataTypesPackage.Literals.CHARACTER_STRING_DATA_TYPE__COLLATION_NAME, newCollationName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterSet getCharacterSet() {
		return (CharacterSet)eGet(SQLDataTypesPackage.Literals.CHARACTER_STRING_DATA_TYPE__CHARACTER_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacterSet(CharacterSet newCharacterSet) {
		eSet(SQLDataTypesPackage.Literals.CHARACTER_STRING_DATA_TYPE__CHARACTER_SET, newCharacterSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoercibilityType getCoercibility() {
		return (CoercibilityType)eGet(SQLDataTypesPackage.Literals.CHARACTER_STRING_DATA_TYPE__COERCIBILITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoercibility(CoercibilityType newCoercibility) {
		eSet(SQLDataTypesPackage.Literals.CHARACTER_STRING_DATA_TYPE__COERCIBILITY, newCoercibility);
	}

} //CharacterStringDataTypeImpl
