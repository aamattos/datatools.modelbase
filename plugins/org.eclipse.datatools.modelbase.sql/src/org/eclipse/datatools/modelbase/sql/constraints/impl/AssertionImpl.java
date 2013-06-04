/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.constraints.impl;

import org.eclipse.datatools.modelbase.sql.constraints.Assertion;
import org.eclipse.datatools.modelbase.sql.constraints.SQLConstraintsPackage;
import org.eclipse.datatools.modelbase.sql.expressions.SearchCondition;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.BaseTable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.AssertionImpl#getSearchCondition <em>Search Condition</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.AssertionImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.AssertionImpl#getConstrainedTables <em>Constrained Tables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssertionImpl extends ConstraintImpl implements Assertion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLConstraintsPackage.Literals.ASSERTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchCondition getSearchCondition() {
		return (SearchCondition)eGet(SQLConstraintsPackage.Literals.ASSERTION__SEARCH_CONDITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchCondition(SearchCondition newSearchCondition) {
		eSet(SQLConstraintsPackage.Literals.ASSERTION__SEARCH_CONDITION, newSearchCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getSchema() {
		return (Schema)eGet(SQLConstraintsPackage.Literals.ASSERTION__SCHEMA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(Schema newSchema) {
		eSet(SQLConstraintsPackage.Literals.ASSERTION__SCHEMA, newSchema);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BaseTable> getConstrainedTables() {
		return (EList<BaseTable>)eGet(SQLConstraintsPackage.Literals.ASSERTION__CONSTRAINED_TABLES, true);
	}

} //AssertionImpl
