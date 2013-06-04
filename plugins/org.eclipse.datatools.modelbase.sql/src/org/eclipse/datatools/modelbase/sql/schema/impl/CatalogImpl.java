/**
 * <copyright>
 * </copyright>
 *
 * $Id: ECatalogImpl.java,v 1.13 2012/01/23 14:33:55 adeunabr Exp $
 */
package org.eclipse.datatools.modelbase.sql.schema.impl;

import org.eclipse.datatools.modelbase.sql.schema.Catalog;
import org.eclipse.datatools.modelbase.sql.schema.Database;
import org.eclipse.datatools.modelbase.sql.schema.SQLSchemaPackage;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.CatalogImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.CatalogImpl#getSchemas <em>Schemas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CatalogImpl extends SQLObjectImpl implements Catalog {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLSchemaPackage.Literals.CATALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database getDatabase() {
		return (Database)eGet(SQLSchemaPackage.Literals.CATALOG__DATABASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(Database newDatabase) {
		eSet(SQLSchemaPackage.Literals.CATALOG__DATABASE, newDatabase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Schema> getSchemas() {
		return (EList<Schema>)eGet(SQLSchemaPackage.Literals.CATALOG__SCHEMAS, true);
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

} //ECatalogImpl
