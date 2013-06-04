/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.schema.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.eclipse.datatools.modelbase.sql.accesscontrol.AuthorizationIdentifier;
import org.eclipse.datatools.modelbase.sql.datatypes.UserDefinedType;
import org.eclipse.datatools.modelbase.sql.schema.Catalog;
import org.eclipse.datatools.modelbase.sql.schema.Database;
import org.eclipse.datatools.modelbase.sql.schema.Event;
import org.eclipse.datatools.modelbase.sql.schema.SQLSchemaPackage;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.DatabaseImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.DatabaseImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.DatabaseImpl#getSchemas <em>Schemas</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.DatabaseImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.DatabaseImpl#getCatalogs <em>Catalogs</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.DatabaseImpl#getAuthorizationIds <em>Authorization Ids</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseImpl extends SQLObjectImpl implements Database {

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLSchemaPackage.Literals.DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVendor() {
		return (String)eGet(SQLSchemaPackage.Literals.DATABASE__VENDOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(String newVendor) {
		eSet(SQLSchemaPackage.Literals.DATABASE__VENDOR, newVendor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return (String)eGet(SQLSchemaPackage.Literals.DATABASE__VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		eSet(SQLSchemaPackage.Literals.DATABASE__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Schema> getSchemas() {
		return (EList<Schema>)eGet(SQLSchemaPackage.Literals.DATABASE__SCHEMAS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Event> getEvents() {
		return (EList<Event>)eGet(SQLSchemaPackage.Literals.DATABASE__EVENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Catalog> getCatalogs() {
		return (EList<Catalog>)eGet(SQLSchemaPackage.Literals.DATABASE__CATALOGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AuthorizationIdentifier> getAuthorizationIds() {
		return (EList<AuthorizationIdentifier>)eGet(SQLSchemaPackage.Literals.DATABASE__AUTHORIZATION_IDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public List getUserDefinedTypes() {
		Vector udtList = new Vector();
		EList schemas = this.getSchemas();
		if (schemas != null) {
			Iterator schemaIterator = schemas.iterator();
			while(schemaIterator.hasNext()) {
				Schema currentSchema = (Schema)schemaIterator.next();
				EList udts = currentSchema.getUserDefinedTypes();
				if (udts != null) {
					Iterator udtIterator = udts.iterator();
					while(udtIterator.hasNext()) {
						UserDefinedType currentUDT = (UserDefinedType)udtIterator.next();
						udtList.add(currentUDT);
					}
				}
			}
		}
		return (List)udtList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SQLSchemaPackage.DATABASE___GET_USER_DEFINED_TYPES:
				return getUserDefinedTypes();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DatabaseImpl
