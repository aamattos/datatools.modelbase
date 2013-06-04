/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.routines.impl;

import org.eclipse.datatools.modelbase.sql.routines.Procedure;
import org.eclipse.datatools.modelbase.sql.routines.RoutineResultTable;
import org.eclipse.datatools.modelbase.sql.routines.SQLRoutinesPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.ProcedureImpl#getMaxResultSets <em>Max Result Sets</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.ProcedureImpl#isOldSavePoint <em>Old Save Point</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.ProcedureImpl#getResultSet <em>Result Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureImpl extends RoutineImpl implements Procedure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLRoutinesPackage.Literals.PROCEDURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxResultSets() {
		return (Integer)eGet(SQLRoutinesPackage.Literals.PROCEDURE__MAX_RESULT_SETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxResultSets(int newMaxResultSets) {
		eSet(SQLRoutinesPackage.Literals.PROCEDURE__MAX_RESULT_SETS, newMaxResultSets);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOldSavePoint() {
		return (Boolean)eGet(SQLRoutinesPackage.Literals.PROCEDURE__OLD_SAVE_POINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldSavePoint(boolean newOldSavePoint) {
		eSet(SQLRoutinesPackage.Literals.PROCEDURE__OLD_SAVE_POINT, newOldSavePoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RoutineResultTable> getResultSet() {
		return (EList<RoutineResultTable>)eGet(SQLRoutinesPackage.Literals.PROCEDURE__RESULT_SET, true);
	}

} //ProcedureImpl
