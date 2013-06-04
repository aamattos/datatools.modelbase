/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.routines.impl;

import org.eclipse.datatools.modelbase.sql.routines.Function;
import org.eclipse.datatools.modelbase.sql.routines.Parameter;
import org.eclipse.datatools.modelbase.sql.routines.RoutineResultTable;
import org.eclipse.datatools.modelbase.sql.routines.SQLRoutinesPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.FunctionImpl#isNullCall <em>Null Call</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.FunctionImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.FunctionImpl#getTransformGroup <em>Transform Group</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.FunctionImpl#isTypePreserving <em>Type Preserving</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.FunctionImpl#isMutator <em>Mutator</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.FunctionImpl#getReturnTable <em>Return Table</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.FunctionImpl#getReturnScalar <em>Return Scalar</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.FunctionImpl#getReturnCast <em>Return Cast</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionImpl extends RoutineImpl implements Function {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLRoutinesPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNullCall() {
		return (Boolean)eGet(SQLRoutinesPackage.Literals.FUNCTION__NULL_CALL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullCall(boolean newNullCall) {
		eSet(SQLRoutinesPackage.Literals.FUNCTION__NULL_CALL, newNullCall);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		return (Boolean)eGet(SQLRoutinesPackage.Literals.FUNCTION__STATIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(boolean newStatic) {
		eSet(SQLRoutinesPackage.Literals.FUNCTION__STATIC, newStatic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransformGroup() {
		return (String)eGet(SQLRoutinesPackage.Literals.FUNCTION__TRANSFORM_GROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformGroup(String newTransformGroup) {
		eSet(SQLRoutinesPackage.Literals.FUNCTION__TRANSFORM_GROUP, newTransformGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTypePreserving() {
		return (Boolean)eGet(SQLRoutinesPackage.Literals.FUNCTION__TYPE_PRESERVING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypePreserving(boolean newTypePreserving) {
		eSet(SQLRoutinesPackage.Literals.FUNCTION__TYPE_PRESERVING, newTypePreserving);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMutator() {
		return (Boolean)eGet(SQLRoutinesPackage.Literals.FUNCTION__MUTATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMutator(boolean newMutator) {
		eSet(SQLRoutinesPackage.Literals.FUNCTION__MUTATOR, newMutator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutineResultTable getReturnTable() {
		return (RoutineResultTable)eGet(SQLRoutinesPackage.Literals.FUNCTION__RETURN_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnTable(RoutineResultTable newReturnTable) {
		eSet(SQLRoutinesPackage.Literals.FUNCTION__RETURN_TABLE, newReturnTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getReturnScalar() {
		return (Parameter)eGet(SQLRoutinesPackage.Literals.FUNCTION__RETURN_SCALAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnScalar(Parameter newReturnScalar) {
		eSet(SQLRoutinesPackage.Literals.FUNCTION__RETURN_SCALAR, newReturnScalar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getReturnCast() {
		return (Parameter)eGet(SQLRoutinesPackage.Literals.FUNCTION__RETURN_CAST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnCast(Parameter newReturnCast) {
		eSet(SQLRoutinesPackage.Literals.FUNCTION__RETURN_CAST, newReturnCast);
	}

} //FunctionImpl
