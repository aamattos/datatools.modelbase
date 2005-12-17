/**
 * <copyright>
 * </copyright>
 *
 * $Id: ValueExpressionCaseImpl.java,v 1.1 2005/12/16 13:11:13 bpayton Exp $
 */
package org.eclipse.datatools.modelbase.sql.query.impl;

import java.util.Collection;

import org.eclipse.datatools.modelbase.sql.datatypes.DataType;
import org.eclipse.datatools.modelbase.sql.query.GroupingExpression;
import org.eclipse.datatools.modelbase.sql.query.OrderByValueExpression;
import org.eclipse.datatools.modelbase.sql.query.PredicateBasic;
import org.eclipse.datatools.modelbase.sql.query.PredicateBetween;
import org.eclipse.datatools.modelbase.sql.query.PredicateInValueList;
import org.eclipse.datatools.modelbase.sql.query.PredicateInValueRowSelect;
import org.eclipse.datatools.modelbase.sql.query.PredicateInValueSelect;
import org.eclipse.datatools.modelbase.sql.query.PredicateIsNull;
import org.eclipse.datatools.modelbase.sql.query.PredicateLike;
import org.eclipse.datatools.modelbase.sql.query.PredicateQuantifiedRowSelect;
import org.eclipse.datatools.modelbase.sql.query.PredicateQuantifiedValueSelect;
import org.eclipse.datatools.modelbase.sql.query.ResultColumn;
import org.eclipse.datatools.modelbase.sql.query.SQLQueryPackage;
import org.eclipse.datatools.modelbase.sql.query.UpdateSourceExprList;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionCase;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionCaseElse;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionCaseSearchContent;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionCaseSimple;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionCaseSimpleContent;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionCast;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionCombined;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionFunction;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionLabeledDuration;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionNested;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionUnaryOperator;
import org.eclipse.datatools.modelbase.sql.query.ValuesRow;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.InternalEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SQL Value Expression Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.query.impl.ValueExpressionCaseImpl#getCaseElse <em>Case Else</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ValueExpressionCaseImpl extends ValueExpressionAtomicImpl implements ValueExpressionCase {
	/**
	 * The cached value of the '{@link #getCaseElse() <em>Case Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCaseElse()
	 * @generated
	 * @ordered
	 */
    protected ValueExpressionCaseElse caseElse = null;

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ValueExpressionCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected EClass eStaticClass() {
		return SQLQueryPackage.eINSTANCE.getValueExpressionCase();
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValueExpressionCaseElse getCaseElse() {
		return caseElse;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetCaseElse(ValueExpressionCaseElse newCaseElse, NotificationChain msgs) {
		ValueExpressionCaseElse oldCaseElse = caseElse;
		caseElse = newCaseElse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SQLQueryPackage.VALUE_EXPRESSION_CASE__CASE_ELSE, oldCaseElse, newCaseElse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCaseElse(ValueExpressionCaseElse newCaseElse) {
		if (newCaseElse != caseElse) {
			NotificationChain msgs = null;
			if (caseElse != null)
				msgs = ((InternalEObject)caseElse).eInverseRemove(this, SQLQueryPackage.VALUE_EXPRESSION_CASE_ELSE__VALUE_EXPR_CASE, ValueExpressionCaseElse.class, msgs);
			if (newCaseElse != null)
				msgs = ((InternalEObject)newCaseElse).eInverseAdd(this, SQLQueryPackage.VALUE_EXPRESSION_CASE_ELSE__VALUE_EXPR_CASE, ValueExpressionCaseElse.class, msgs);
			msgs = basicSetCaseElse(newCaseElse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQLQueryPackage.VALUE_EXPRESSION_CASE__CASE_ELSE, newCaseElse, newCaseElse));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUES_ROW:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUES_ROW, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__ORDER_BY_VALUE_EXPR:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__ORDER_BY_VALUE_EXPR, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__RESULT_COLUMN:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__RESULT_COLUMN, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__BASIC_RIGHT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__BASIC_RIGHT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__BASIC_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__BASIC_LEFT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_PATTERN:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_PATTERN, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_MATCHING:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_MATCHING, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__PREDICATE_NULL:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__PREDICATE_NULL, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_LIST_RIGHT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_LIST_RIGHT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_LIST_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_LIST_LEFT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_ROW_SELECT_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_ROW_SELECT_LEFT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_SELECT_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_SELECT_LEFT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__QUANTIFIED_ROW_SELECT_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__QUANTIFIED_ROW_SELECT_LEFT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__QUANTIFIED_VALUE_SELECT_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__QUANTIFIED_VALUE_SELECT_LEFT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_LEFT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_RIGHT1:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_RIGHT1, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_RIGHT2:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_RIGHT2, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CAST:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CAST, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_FUNCTION:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_FUNCTION, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_COMBINED_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_COMBINED_LEFT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_COMBINED_RIGHT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_COMBINED_RIGHT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__GROUPING_EXPR:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__GROUPING_EXPR, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_ELSE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_ELSE, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SEARCH_CONTENT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SEARCH_CONTENT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_ESCAPE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_ESCAPE, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_LABELED_DURATION:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_LABELED_DURATION, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__NEST:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__NEST, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__UPDATE_SOURCE_EXPR_LIST:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLQueryPackage.VALUE_EXPRESSION_CASE__UPDATE_SOURCE_EXPR_LIST, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__CASE_ELSE:
					if (caseElse != null)
						msgs = ((InternalEObject)caseElse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SQLQueryPackage.VALUE_EXPRESSION_CASE__CASE_ELSE, null, msgs);
					return basicSetCaseElse((ValueExpressionCaseElse)otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__DEPENDENCIES:
					return ((InternalEList)getDependencies()).basicRemove(otherEnd, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__DATA_TYPE:
					return basicSetDataType(null, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUES_ROW:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUES_ROW, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__ORDER_BY_VALUE_EXPR:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__ORDER_BY_VALUE_EXPR, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__RESULT_COLUMN:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__RESULT_COLUMN, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__BASIC_RIGHT:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__BASIC_RIGHT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__BASIC_LEFT:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__BASIC_LEFT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_PATTERN:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_PATTERN, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_MATCHING:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_MATCHING, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__PREDICATE_NULL:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__PREDICATE_NULL, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_LIST_RIGHT:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_LIST_RIGHT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_LIST_LEFT:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_LIST_LEFT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_ROW_SELECT_LEFT:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_ROW_SELECT_LEFT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_SELECT_LEFT:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_SELECT_LEFT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__QUANTIFIED_ROW_SELECT_LEFT:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__QUANTIFIED_ROW_SELECT_LEFT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__QUANTIFIED_VALUE_SELECT_LEFT:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__QUANTIFIED_VALUE_SELECT_LEFT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_LEFT:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_LEFT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_RIGHT1:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_RIGHT1, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_RIGHT2:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_RIGHT2, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CAST:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CAST, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_FUNCTION:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_FUNCTION, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_COMBINED_LEFT:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_COMBINED_LEFT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_COMBINED_RIGHT:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_COMBINED_RIGHT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__GROUPING_EXPR:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__GROUPING_EXPR, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_ELSE:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_ELSE, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SEARCH_CONTENT:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SEARCH_CONTENT, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_ESCAPE:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_ESCAPE, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_LABELED_DURATION:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_LABELED_DURATION, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__NEST:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__NEST, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__UPDATE_SOURCE_EXPR_LIST:
					return eBasicSetContainer(null, SQLQueryPackage.VALUE_EXPRESSION_CASE__UPDATE_SOURCE_EXPR_LIST, msgs);
				case SQLQueryPackage.VALUE_EXPRESSION_CASE__CASE_ELSE:
					return basicSetCaseElse(null, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__EANNOTATIONS:
				return getEAnnotations();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__NAME:
				return getName();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__DEPENDENCIES:
				return getDependencies();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__DESCRIPTION:
				return getDescription();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__LABEL:
				return getLabel();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__UNARY_OPERATOR:
				return getUnaryOperator();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__DATA_TYPE:
				return getDataType();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUES_ROW:
				return getValuesRow();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__ORDER_BY_VALUE_EXPR:
				return getOrderByValueExpr();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__RESULT_COLUMN:
				return getResultColumn();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__BASIC_RIGHT:
				return getBasicRight();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__BASIC_LEFT:
				return getBasicLeft();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_PATTERN:
				return getLikePattern();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_MATCHING:
				return getLikeMatching();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__PREDICATE_NULL:
				return getPredicateNull();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_LIST_RIGHT:
				return getInValueListRight();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_LIST_LEFT:
				return getInValueListLeft();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_ROW_SELECT_LEFT:
				return getInValueRowSelectLeft();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_SELECT_LEFT:
				return getInValueSelectLeft();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__QUANTIFIED_ROW_SELECT_LEFT:
				return getQuantifiedRowSelectLeft();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__QUANTIFIED_VALUE_SELECT_LEFT:
				return getQuantifiedValueSelectLeft();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_LEFT:
				return getBetweenLeft();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_RIGHT1:
				return getBetweenRight1();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_RIGHT2:
				return getBetweenRight2();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CAST:
				return getValueExprCast();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_FUNCTION:
				return getValueExprFunction();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_COMBINED_LEFT:
				return getValueExprCombinedLeft();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_COMBINED_RIGHT:
				return getValueExprCombinedRight();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__GROUPING_EXPR:
				return getGroupingExpr();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_ELSE:
				return getValueExprCaseElse();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE:
				return getValueExprCaseSimple();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
				return getValueExprCaseSimpleContentWhen();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
				return getValueExprCaseSimpleContentResult();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SEARCH_CONTENT:
				return getValueExprCaseSearchContent();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_ESCAPE:
				return getLikeEscape();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_LABELED_DURATION:
				return getValueExprLabeledDuration();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__NEST:
				return getNest();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__UPDATE_SOURCE_EXPR_LIST:
				return getUpdateSourceExprList();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__CASE_ELSE:
				return getCaseElse();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__NAME:
				setName((String)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__LABEL:
				setLabel((String)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__UNARY_OPERATOR:
				setUnaryOperator((ValueExpressionUnaryOperator)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUES_ROW:
				setValuesRow((ValuesRow)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__ORDER_BY_VALUE_EXPR:
				setOrderByValueExpr((OrderByValueExpression)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__RESULT_COLUMN:
				setResultColumn((ResultColumn)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__BASIC_RIGHT:
				setBasicRight((PredicateBasic)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__BASIC_LEFT:
				setBasicLeft((PredicateBasic)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_PATTERN:
				setLikePattern((PredicateLike)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_MATCHING:
				setLikeMatching((PredicateLike)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__PREDICATE_NULL:
				setPredicateNull((PredicateIsNull)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_LIST_RIGHT:
				setInValueListRight((PredicateInValueList)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_LIST_LEFT:
				setInValueListLeft((PredicateInValueList)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_ROW_SELECT_LEFT:
				setInValueRowSelectLeft((PredicateInValueRowSelect)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_SELECT_LEFT:
				setInValueSelectLeft((PredicateInValueSelect)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__QUANTIFIED_ROW_SELECT_LEFT:
				setQuantifiedRowSelectLeft((PredicateQuantifiedRowSelect)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__QUANTIFIED_VALUE_SELECT_LEFT:
				setQuantifiedValueSelectLeft((PredicateQuantifiedValueSelect)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_LEFT:
				setBetweenLeft((PredicateBetween)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_RIGHT1:
				setBetweenRight1((PredicateBetween)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_RIGHT2:
				setBetweenRight2((PredicateBetween)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CAST:
				setValueExprCast((ValueExpressionCast)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_FUNCTION:
				setValueExprFunction((ValueExpressionFunction)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_COMBINED_LEFT:
				setValueExprCombinedLeft((ValueExpressionCombined)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_COMBINED_RIGHT:
				setValueExprCombinedRight((ValueExpressionCombined)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__GROUPING_EXPR:
				setGroupingExpr((GroupingExpression)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_ELSE:
				setValueExprCaseElse((ValueExpressionCaseElse)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE:
				setValueExprCaseSimple((ValueExpressionCaseSimple)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
				setValueExprCaseSimpleContentWhen((ValueExpressionCaseSimpleContent)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
				setValueExprCaseSimpleContentResult((ValueExpressionCaseSimpleContent)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SEARCH_CONTENT:
				setValueExprCaseSearchContent((ValueExpressionCaseSearchContent)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_ESCAPE:
				setLikeEscape((PredicateLike)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_LABELED_DURATION:
				setValueExprLabeledDuration((ValueExpressionLabeledDuration)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__NEST:
				setNest((ValueExpressionNested)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__UPDATE_SOURCE_EXPR_LIST:
				setUpdateSourceExprList((UpdateSourceExprList)newValue);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__CASE_ELSE:
				setCaseElse((ValueExpressionCaseElse)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__DEPENDENCIES:
				getDependencies().clear();
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__UNARY_OPERATOR:
				setUnaryOperator(UNARY_OPERATOR_EDEFAULT);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__DATA_TYPE:
				setDataType((DataType)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUES_ROW:
				setValuesRow((ValuesRow)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__ORDER_BY_VALUE_EXPR:
				setOrderByValueExpr((OrderByValueExpression)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__RESULT_COLUMN:
				setResultColumn((ResultColumn)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__BASIC_RIGHT:
				setBasicRight((PredicateBasic)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__BASIC_LEFT:
				setBasicLeft((PredicateBasic)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_PATTERN:
				setLikePattern((PredicateLike)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_MATCHING:
				setLikeMatching((PredicateLike)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__PREDICATE_NULL:
				setPredicateNull((PredicateIsNull)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_LIST_RIGHT:
				setInValueListRight((PredicateInValueList)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_LIST_LEFT:
				setInValueListLeft((PredicateInValueList)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_ROW_SELECT_LEFT:
				setInValueRowSelectLeft((PredicateInValueRowSelect)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_SELECT_LEFT:
				setInValueSelectLeft((PredicateInValueSelect)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__QUANTIFIED_ROW_SELECT_LEFT:
				setQuantifiedRowSelectLeft((PredicateQuantifiedRowSelect)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__QUANTIFIED_VALUE_SELECT_LEFT:
				setQuantifiedValueSelectLeft((PredicateQuantifiedValueSelect)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_LEFT:
				setBetweenLeft((PredicateBetween)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_RIGHT1:
				setBetweenRight1((PredicateBetween)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_RIGHT2:
				setBetweenRight2((PredicateBetween)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CAST:
				setValueExprCast((ValueExpressionCast)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_FUNCTION:
				setValueExprFunction((ValueExpressionFunction)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_COMBINED_LEFT:
				setValueExprCombinedLeft((ValueExpressionCombined)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_COMBINED_RIGHT:
				setValueExprCombinedRight((ValueExpressionCombined)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__GROUPING_EXPR:
				setGroupingExpr((GroupingExpression)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_ELSE:
				setValueExprCaseElse((ValueExpressionCaseElse)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE:
				setValueExprCaseSimple((ValueExpressionCaseSimple)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
				setValueExprCaseSimpleContentWhen((ValueExpressionCaseSimpleContent)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
				setValueExprCaseSimpleContentResult((ValueExpressionCaseSimpleContent)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SEARCH_CONTENT:
				setValueExprCaseSearchContent((ValueExpressionCaseSearchContent)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_ESCAPE:
				setLikeEscape((PredicateLike)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_LABELED_DURATION:
				setValueExprLabeledDuration((ValueExpressionLabeledDuration)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__NEST:
				setNest((ValueExpressionNested)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__UPDATE_SOURCE_EXPR_LIST:
				setUpdateSourceExprList((UpdateSourceExprList)null);
				return;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__CASE_ELSE:
				setCaseElse((ValueExpressionCaseElse)null);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__UNARY_OPERATOR:
				return unaryOperator != UNARY_OPERATOR_EDEFAULT;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__DATA_TYPE:
				return dataType != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUES_ROW:
				return getValuesRow() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__ORDER_BY_VALUE_EXPR:
				return getOrderByValueExpr() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__RESULT_COLUMN:
				return getResultColumn() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__BASIC_RIGHT:
				return getBasicRight() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__BASIC_LEFT:
				return getBasicLeft() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_PATTERN:
				return getLikePattern() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_MATCHING:
				return getLikeMatching() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__PREDICATE_NULL:
				return getPredicateNull() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_LIST_RIGHT:
				return getInValueListRight() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_LIST_LEFT:
				return getInValueListLeft() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_ROW_SELECT_LEFT:
				return getInValueRowSelectLeft() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__IN_VALUE_SELECT_LEFT:
				return getInValueSelectLeft() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__QUANTIFIED_ROW_SELECT_LEFT:
				return getQuantifiedRowSelectLeft() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__QUANTIFIED_VALUE_SELECT_LEFT:
				return getQuantifiedValueSelectLeft() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_LEFT:
				return getBetweenLeft() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_RIGHT1:
				return getBetweenRight1() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__BETWEEN_RIGHT2:
				return getBetweenRight2() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CAST:
				return getValueExprCast() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_FUNCTION:
				return getValueExprFunction() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_COMBINED_LEFT:
				return getValueExprCombinedLeft() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_COMBINED_RIGHT:
				return getValueExprCombinedRight() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__GROUPING_EXPR:
				return getGroupingExpr() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_ELSE:
				return getValueExprCaseElse() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE:
				return getValueExprCaseSimple() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
				return getValueExprCaseSimpleContentWhen() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
				return getValueExprCaseSimpleContentResult() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_CASE_SEARCH_CONTENT:
				return getValueExprCaseSearchContent() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__LIKE_ESCAPE:
				return getLikeEscape() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__VALUE_EXPR_LABELED_DURATION:
				return getValueExprLabeledDuration() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__NEST:
				return getNest() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__UPDATE_SOURCE_EXPR_LIST:
				return getUpdateSourceExprList() != null;
			case SQLQueryPackage.VALUE_EXPRESSION_CASE__CASE_ELSE:
				return caseElse != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //SQLValueExpressionCaseImpl