/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.routines.impl;

import org.eclipse.datatools.modelbase.sql.routines.DataAccess;
import org.eclipse.datatools.modelbase.sql.routines.Parameter;
import org.eclipse.datatools.modelbase.sql.routines.Routine;
import org.eclipse.datatools.modelbase.sql.routines.SQLRoutinesPackage;
import org.eclipse.datatools.modelbase.sql.routines.Source;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.impl.SQLObjectImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Routine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.RoutineImpl#getSpecificName <em>Specific Name</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.RoutineImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.RoutineImpl#getParameterStyle <em>Parameter Style</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.RoutineImpl#isDeterministic <em>Deterministic</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.RoutineImpl#getSqlDataAccess <em>Sql Data Access</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.RoutineImpl#getCreationTS <em>Creation TS</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.RoutineImpl#getLastAlteredTS <em>Last Altered TS</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.RoutineImpl#getAuthorizationID <em>Authorization ID</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.RoutineImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.RoutineImpl#getExternalName <em>External Name</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.RoutineImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.RoutineImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.RoutineImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RoutineImpl extends SQLObjectImpl implements Routine {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoutineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLRoutinesPackage.Literals.ROUTINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecificName() {
		return (String)eGet(SQLRoutinesPackage.Literals.ROUTINE__SPECIFIC_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificName(String newSpecificName) {
		eSet(SQLRoutinesPackage.Literals.ROUTINE__SPECIFIC_NAME, newSpecificName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return (String)eGet(SQLRoutinesPackage.Literals.ROUTINE__LANGUAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		eSet(SQLRoutinesPackage.Literals.ROUTINE__LANGUAGE, newLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterStyle() {
		return (String)eGet(SQLRoutinesPackage.Literals.ROUTINE__PARAMETER_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterStyle(String newParameterStyle) {
		eSet(SQLRoutinesPackage.Literals.ROUTINE__PARAMETER_STYLE, newParameterStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeterministic() {
		return (Boolean)eGet(SQLRoutinesPackage.Literals.ROUTINE__DETERMINISTIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeterministic(boolean newDeterministic) {
		eSet(SQLRoutinesPackage.Literals.ROUTINE__DETERMINISTIC, newDeterministic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAccess getSqlDataAccess() {
		return (DataAccess)eGet(SQLRoutinesPackage.Literals.ROUTINE__SQL_DATA_ACCESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqlDataAccess(DataAccess newSqlDataAccess) {
		eSet(SQLRoutinesPackage.Literals.ROUTINE__SQL_DATA_ACCESS, newSqlDataAccess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationTS() {
		return (String)eGet(SQLRoutinesPackage.Literals.ROUTINE__CREATION_TS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationTS(String newCreationTS) {
		eSet(SQLRoutinesPackage.Literals.ROUTINE__CREATION_TS, newCreationTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastAlteredTS() {
		return (String)eGet(SQLRoutinesPackage.Literals.ROUTINE__LAST_ALTERED_TS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastAlteredTS(String newLastAlteredTS) {
		eSet(SQLRoutinesPackage.Literals.ROUTINE__LAST_ALTERED_TS, newLastAlteredTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthorizationID() {
		return (String)eGet(SQLRoutinesPackage.Literals.ROUTINE__AUTHORIZATION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorizationID(String newAuthorizationID) {
		eSet(SQLRoutinesPackage.Literals.ROUTINE__AUTHORIZATION_ID, newAuthorizationID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurity() {
		return (String)eGet(SQLRoutinesPackage.Literals.ROUTINE__SECURITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurity(String newSecurity) {
		eSet(SQLRoutinesPackage.Literals.ROUTINE__SECURITY, newSecurity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalName() {
		return (String)eGet(SQLRoutinesPackage.Literals.ROUTINE__EXTERNAL_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalName(String newExternalName) {
		eSet(SQLRoutinesPackage.Literals.ROUTINE__EXTERNAL_NAME, newExternalName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Parameter> getParameters() {
		return (EList<Parameter>)eGet(SQLRoutinesPackage.Literals.ROUTINE__PARAMETERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getSource() {
		return (Source)eGet(SQLRoutinesPackage.Literals.ROUTINE__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Source newSource) {
		eSet(SQLRoutinesPackage.Literals.ROUTINE__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getSchema() {
		return (Schema)eGet(SQLRoutinesPackage.Literals.ROUTINE__SCHEMA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(Schema newSchema) {
		eSet(SQLRoutinesPackage.Literals.ROUTINE__SCHEMA, newSchema);
	}

} //RoutineImpl
