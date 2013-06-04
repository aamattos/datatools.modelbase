/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.datatypes.impl;

import org.eclipse.datatools.modelbase.sql.datatypes.CharacterSet;
import org.eclipse.datatools.modelbase.sql.datatypes.CharacterStringDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.impl.SQLObjectImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.CharacterSetImpl#getRepertoire <em>Repertoire</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.CharacterSetImpl#getDefaultCollation <em>Default Collation</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.CharacterSetImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.CharacterSetImpl#getCharacterStringDataType <em>Character String Data Type</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.CharacterSetImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CharacterSetImpl extends SQLObjectImpl implements CharacterSet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLDataTypesPackage.Literals.CHARACTER_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultCollation() {
		return (String)eGet(SQLDataTypesPackage.Literals.CHARACTER_SET__DEFAULT_COLLATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultCollation(String newDefaultCollation) {
		eSet(SQLDataTypesPackage.Literals.CHARACTER_SET__DEFAULT_COLLATION, newDefaultCollation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncoding() {
		return (String)eGet(SQLDataTypesPackage.Literals.CHARACTER_SET__ENCODING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(String newEncoding) {
		eSet(SQLDataTypesPackage.Literals.CHARACTER_SET__ENCODING, newEncoding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterStringDataType getCharacterStringDataType() {
		return (CharacterStringDataType)eGet(SQLDataTypesPackage.Literals.CHARACTER_SET__CHARACTER_STRING_DATA_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacterStringDataType(CharacterStringDataType newCharacterStringDataType) {
		eSet(SQLDataTypesPackage.Literals.CHARACTER_SET__CHARACTER_STRING_DATA_TYPE, newCharacterStringDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getSchema() {
		return (Schema)eGet(SQLDataTypesPackage.Literals.CHARACTER_SET__SCHEMA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(Schema newSchema) {
		eSet(SQLDataTypesPackage.Literals.CHARACTER_SET__SCHEMA, newSchema);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepertoire() {
		return (String)eGet(SQLDataTypesPackage.Literals.CHARACTER_SET__REPERTOIRE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepertoire(String newRepertoire) {
		eSet(SQLDataTypesPackage.Literals.CHARACTER_SET__REPERTOIRE, newRepertoire);
	}

} //CharacterSetImpl
