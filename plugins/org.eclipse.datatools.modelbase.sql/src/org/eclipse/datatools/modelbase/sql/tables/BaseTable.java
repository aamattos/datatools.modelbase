/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.tables;

import java.util.List;

import org.eclipse.datatools.modelbase.sql.constraints.ForeignKey;
import org.eclipse.datatools.modelbase.sql.constraints.PrimaryKey;
import org.eclipse.datatools.modelbase.sql.constraints.TableConstraint;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reference: 5WD-02-Foundation-2002-12 4.14 Tables
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.BaseTable#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.BaseTable#getReferencingForeignKeys <em>Referencing Foreign Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.datatools.modelbase.sql.tables.SQLTablesPackage#getBaseTable()
 * @model abstract="true"
 * @generated
 */
public interface BaseTable extends Table {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.datatools.modelbase.sql.constraints.TableConstraint}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.datatools.modelbase.sql.constraints.TableConstraint#getBaseTable <em>Base Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see org.eclipse.datatools.modelbase.sql.tables.SQLTablesPackage#getBaseTable_Constraints()
	 * @see org.eclipse.datatools.modelbase.sql.constraints.TableConstraint#getBaseTable
	 * @model opposite="BaseTable" containment="true"
	 * @generated
	 */
	EList<TableConstraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Referencing Foreign Keys</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.datatools.modelbase.sql.constraints.ForeignKey}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.datatools.modelbase.sql.constraints.ForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referencing Foreign Keys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencing Foreign Keys</em>' reference list.
	 * @see org.eclipse.datatools.modelbase.sql.tables.SQLTablesPackage#getBaseTable_ReferencingForeignKeys()
	 * @see org.eclipse.datatools.modelbase.sql.constraints.ForeignKey#getReferencedTable
	 * @model opposite="referencedTable"
	 * @generated
	 */
	EList<ForeignKey> getReferencingForeignKeys();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.datatools.modelbase.sql.schema.List" many="false"
	 * @generated
	 */
	List getUniqueConstraints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.datatools.modelbase.sql.schema.List" many="false"
	 * @generated
	 */
	List getForeignKeys();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	PrimaryKey getPrimaryKey();

} // BaseTable
