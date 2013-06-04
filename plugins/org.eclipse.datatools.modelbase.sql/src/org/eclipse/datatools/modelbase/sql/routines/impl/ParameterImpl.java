/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.routines.impl;

import org.eclipse.datatools.modelbase.sql.datatypes.CharacterStringDataType;
import org.eclipse.datatools.modelbase.sql.routines.Parameter;
import org.eclipse.datatools.modelbase.sql.routines.ParameterMode;
import org.eclipse.datatools.modelbase.sql.routines.Routine;
import org.eclipse.datatools.modelbase.sql.routines.SQLRoutinesPackage;
import org.eclipse.datatools.modelbase.sql.schema.impl.TypedElementImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.ParameterImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.ParameterImpl#isLocator <em>Locator</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.ParameterImpl#getRoutine <em>Routine</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.ParameterImpl#getStringTypeOption <em>String Type Option</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends TypedElementImpl implements Parameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLRoutinesPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMode getMode() {
		return (ParameterMode)eGet(SQLRoutinesPackage.Literals.PARAMETER__MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(ParameterMode newMode) {
		eSet(SQLRoutinesPackage.Literals.PARAMETER__MODE, newMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLocator() {
		return (Boolean)eGet(SQLRoutinesPackage.Literals.PARAMETER__LOCATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocator(boolean newLocator) {
		eSet(SQLRoutinesPackage.Literals.PARAMETER__LOCATOR, newLocator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Routine getRoutine() {
		return (Routine)eGet(SQLRoutinesPackage.Literals.PARAMETER__ROUTINE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutine(Routine newRoutine) {
		eSet(SQLRoutinesPackage.Literals.PARAMETER__ROUTINE, newRoutine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterStringDataType getStringTypeOption() {
		return (CharacterStringDataType)eGet(SQLRoutinesPackage.Literals.PARAMETER__STRING_TYPE_OPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringTypeOption(CharacterStringDataType newStringTypeOption) {
		eSet(SQLRoutinesPackage.Literals.PARAMETER__STRING_TYPE_OPTION, newStringTypeOption);
	}

} //ParameterImpl
