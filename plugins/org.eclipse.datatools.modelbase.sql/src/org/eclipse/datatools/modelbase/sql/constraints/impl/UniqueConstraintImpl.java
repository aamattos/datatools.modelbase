/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.constraints.impl;

import org.eclipse.datatools.modelbase.sql.constraints.ForeignKey;
import org.eclipse.datatools.modelbase.sql.constraints.SQLConstraintsPackage;
import org.eclipse.datatools.modelbase.sql.constraints.UniqueConstraint;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unique Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.UniqueConstraintImpl#isClustered <em>Clustered</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.UniqueConstraintImpl#getForeignKey <em>Foreign Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UniqueConstraintImpl extends ReferenceConstraintImpl implements UniqueConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniqueConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLConstraintsPackage.Literals.UNIQUE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClustered() {
		return (Boolean)eGet(SQLConstraintsPackage.Literals.UNIQUE_CONSTRAINT__CLUSTERED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClustered(boolean newClustered) {
		eSet(SQLConstraintsPackage.Literals.UNIQUE_CONSTRAINT__CLUSTERED, newClustered);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ForeignKey> getForeignKey() {
		return (EList<ForeignKey>)eGet(SQLConstraintsPackage.Literals.UNIQUE_CONSTRAINT__FOREIGN_KEY, true);
	}

} //UniqueConstraintImpl
