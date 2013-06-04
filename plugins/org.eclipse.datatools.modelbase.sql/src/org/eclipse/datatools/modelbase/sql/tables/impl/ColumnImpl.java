/**
 * <copyright>
 * </copyright>
 *
 * $Id: EColumnImpl.java,v 1.16.14.9 2013/03/11 19:43:20 n775660 Exp $
 */
package org.eclipse.datatools.modelbase.sql.tables.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.eclipse.datatools.modelbase.sql.constraints.ForeignKey;
import org.eclipse.datatools.modelbase.sql.constraints.PrimaryKey;
import org.eclipse.datatools.modelbase.sql.constraints.UniqueConstraint;
import org.eclipse.datatools.modelbase.sql.expressions.ValueExpression;
import org.eclipse.datatools.modelbase.sql.schema.IdentitySpecifier;
import org.eclipse.datatools.modelbase.sql.schema.ReferentialActionType;
import org.eclipse.datatools.modelbase.sql.schema.impl.TypedElementImpl;
import org.eclipse.datatools.modelbase.sql.tables.BaseTable;
import org.eclipse.datatools.modelbase.sql.tables.Column;
import org.eclipse.datatools.modelbase.sql.tables.SQLTablesPackage;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.ColumnImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.ColumnImpl#getIdentitySpecifier <em>Identity Specifier</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.ColumnImpl#getGenerateExpression <em>Generate Expression</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.ColumnImpl#isImplementationDependent <em>Implementation Dependent</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.ColumnImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.ColumnImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.ColumnImpl#getScopeCheck <em>Scope Check</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.ColumnImpl#isScopeChecked <em>Scope Checked</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnImpl extends TypedElementImpl implements Column {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLTablesPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTable() {
		return (Table)eGet(SQLTablesPackage.Literals.COLUMN__TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(Table newTable) {
		eSet(SQLTablesPackage.Literals.COLUMN__TABLE, newTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentitySpecifier getIdentitySpecifier() {
		return (IdentitySpecifier)eGet(SQLTablesPackage.Literals.COLUMN__IDENTITY_SPECIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentitySpecifier(IdentitySpecifier newIdentitySpecifier) {
		eSet(SQLTablesPackage.Literals.COLUMN__IDENTITY_SPECIFIER, newIdentitySpecifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueExpression getGenerateExpression() {
		return (ValueExpression)eGet(SQLTablesPackage.Literals.COLUMN__GENERATE_EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateExpression(ValueExpression newGenerateExpression) {
		eSet(SQLTablesPackage.Literals.COLUMN__GENERATE_EXPRESSION, newGenerateExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImplementationDependent() {
		return (Boolean)eGet(SQLTablesPackage.Literals.COLUMN__IMPLEMENTATION_DEPENDENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationDependent(boolean newImplementationDependent) {
		eSet(SQLTablesPackage.Literals.COLUMN__IMPLEMENTATION_DEPENDENT, newImplementationDependent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNullable() {
		return (Boolean)eGet(SQLTablesPackage.Literals.COLUMN__NULLABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullable(boolean newNullable) {
		eSet(SQLTablesPackage.Literals.COLUMN__NULLABLE, newNullable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return (String)eGet(SQLTablesPackage.Literals.COLUMN__DEFAULT_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		eSet(SQLTablesPackage.Literals.COLUMN__DEFAULT_VALUE, newDefaultValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultValue() {
		eUnset(SQLTablesPackage.Literals.COLUMN__DEFAULT_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultValue() {
		return eIsSet(SQLTablesPackage.Literals.COLUMN__DEFAULT_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferentialActionType getScopeCheck() {
		return (ReferentialActionType)eGet(SQLTablesPackage.Literals.COLUMN__SCOPE_CHECK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScopeCheck(ReferentialActionType newScopeCheck) {
		eSet(SQLTablesPackage.Literals.COLUMN__SCOPE_CHECK, newScopeCheck);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isScopeChecked() {
		return (Boolean)eGet(SQLTablesPackage.Literals.COLUMN__SCOPE_CHECKED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScopeChecked(boolean newScopeChecked) {
		eSet(SQLTablesPackage.Literals.COLUMN__SCOPE_CHECKED, newScopeChecked);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isPartOfForeignKey() {
		Table table = this.getTable();
		if ( (table != null) && (table instanceof BaseTable) ) {
			Iterator foreignKeys = ((BaseTable)table).getForeignKeys().iterator();
			while( foreignKeys.hasNext() ) {
				ForeignKey currentForeignKey = (ForeignKey)foreignKeys.next();
				if (currentForeignKey != null) {
					EList columns = currentForeignKey.getMembers();
					if ( (columns != null) && columns.contains(this) ) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isPartOfUniqueConstraint() {
		Table table = this.getTable();
		if ( (table != null) && (table instanceof BaseTable) ) {
			Iterator uniqueConstraint = ((BaseTable)table).getUniqueConstraints().iterator();
			while( uniqueConstraint.hasNext() ) {
				UniqueConstraint currentUniqueConstraint = (UniqueConstraint)uniqueConstraint.next();
				if (currentUniqueConstraint != null) {
					EList columns = currentUniqueConstraint.getMembers();
					if ( (columns != null) && columns.contains(this) ) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isPartOfPrimaryKey() {
		Table table = this.getTable();
		if ( (table != null) && (table instanceof BaseTable) ) {
			PrimaryKey primaryKey = ((BaseTable)table).getPrimaryKey();
			if (primaryKey != null) {
				EList columns = primaryKey.getMembers();
				if ( (columns != null) && columns.contains(this) ) {
					return true;
				}
			}
		}
		return false;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SQLTablesPackage.COLUMN___IS_PART_OF_FOREIGN_KEY:
				return isPartOfForeignKey();
			case SQLTablesPackage.COLUMN___IS_PART_OF_UNIQUE_CONSTRAINT:
				return isPartOfUniqueConstraint();
			case SQLTablesPackage.COLUMN___IS_PART_OF_PRIMARY_KEY:
				return isPartOfPrimaryKey();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {		
		return getName();
	}

} //EColumnImpl
