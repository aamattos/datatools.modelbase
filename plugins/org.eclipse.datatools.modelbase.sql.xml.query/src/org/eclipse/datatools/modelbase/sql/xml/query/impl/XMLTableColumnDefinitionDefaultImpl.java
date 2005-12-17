/**
 * <copyright>
 * </copyright>
 *
 * $Id: XMLTableColumnDefinitionDefaultImpl.java,v 1.1 2005/10/22 01:40:26 bpayton Exp $
 */
package org.eclipse.datatools.modelbase.sql.xml.query.impl;




import java.util.Collection;

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
import org.eclipse.datatools.modelbase.sql.query.QueryValueExpression;
import org.eclipse.datatools.modelbase.sql.query.ResultColumn;
import org.eclipse.datatools.modelbase.sql.query.SQLQueryPackage;
import org.eclipse.datatools.modelbase.sql.query.UpdateSourceExprList;
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
import org.eclipse.datatools.modelbase.sql.query.impl.QueryValueExpressionImpl;
import org.eclipse.datatools.modelbase.sql.xml.query.SQLXMLQueryPackage;
import org.eclipse.datatools.modelbase.sql.xml.query.XMLTableColumnDefinitionDefault;
import org.eclipse.datatools.modelbase.sql.xml.query.XMLTableColumnDefinitionRegular;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.datatools.modelbase.sql.datatypes.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Table Column Definition Default</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.xml.query.impl.XMLTableColumnDefinitionDefaultImpl#getValueExpr <em>Value Expr</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.xml.query.impl.XMLTableColumnDefinitionDefaultImpl#getColumnDefinitionRegular <em>Column Definition Regular</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XMLTableColumnDefinitionDefaultImpl extends QueryValueExpressionImpl implements XMLTableColumnDefinitionDefault {
	/**
	 * The cached value of the '{@link #getValueExpr() <em>Value Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getValueExpr()
	 * @generated
	 * @ordered
	 */
    protected QueryValueExpression valueExpr = null;

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected XMLTableColumnDefinitionDefaultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected EClass eStaticClass() {
		return SQLXMLQueryPackage.eINSTANCE.getXMLTableColumnDefinitionDefault();
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public QueryValueExpression getValueExpr() {
		return valueExpr;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetValueExpr(QueryValueExpression newValueExpr, NotificationChain msgs) {
		QueryValueExpression oldValueExpr = valueExpr;
		valueExpr = newValueExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR, oldValueExpr, newValueExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setValueExpr(QueryValueExpression newValueExpr) {
		if (newValueExpr != valueExpr) {
			NotificationChain msgs = null;
			if (valueExpr != null)
				msgs = ((InternalEObject)valueExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR, null, msgs);
			if (newValueExpr != null)
				msgs = ((InternalEObject)newValueExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR, null, msgs);
			msgs = basicSetValueExpr(newValueExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR, newValueExpr, newValueExpr));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public XMLTableColumnDefinitionRegular getColumnDefinitionRegular() {
		if (eContainerFeatureID != SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__COLUMN_DEFINITION_REGULAR) return null;
		return (XMLTableColumnDefinitionRegular)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setColumnDefinitionRegular(XMLTableColumnDefinitionRegular newColumnDefinitionRegular) {
		if (newColumnDefinitionRegular != eContainer || (eContainerFeatureID != SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__COLUMN_DEFINITION_REGULAR && newColumnDefinitionRegular != null)) {
			if (EcoreUtil.isAncestor(this, newColumnDefinitionRegular))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newColumnDefinitionRegular != null)
				msgs = ((InternalEObject)newColumnDefinitionRegular).eInverseAdd(this, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_REGULAR__COLUMN_DEFINITION_DEFAULT, XMLTableColumnDefinitionRegular.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newColumnDefinitionRegular, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__COLUMN_DEFINITION_REGULAR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__COLUMN_DEFINITION_REGULAR, newColumnDefinitionRegular, newColumnDefinitionRegular));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUES_ROW:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUES_ROW, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__ORDER_BY_VALUE_EXPR:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__ORDER_BY_VALUE_EXPR, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__RESULT_COLUMN:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__RESULT_COLUMN, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BASIC_RIGHT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BASIC_RIGHT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BASIC_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BASIC_LEFT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_PATTERN:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_PATTERN, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_MATCHING:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_MATCHING, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__PREDICATE_NULL:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__PREDICATE_NULL, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_LIST_RIGHT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_LIST_RIGHT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_LIST_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_LIST_LEFT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_ROW_SELECT_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_ROW_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_SELECT_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__QUANTIFIED_ROW_SELECT_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__QUANTIFIED_ROW_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__QUANTIFIED_VALUE_SELECT_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__QUANTIFIED_VALUE_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_LEFT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_RIGHT1:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_RIGHT1, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_RIGHT2:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_RIGHT2, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CAST:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CAST, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_FUNCTION:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_FUNCTION, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_COMBINED_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_COMBINED_LEFT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_COMBINED_RIGHT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_COMBINED_RIGHT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__GROUPING_EXPR:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__GROUPING_EXPR, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_ELSE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_ELSE, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SEARCH_CONTENT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SEARCH_CONTENT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_ESCAPE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_ESCAPE, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_LABELED_DURATION:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_LABELED_DURATION, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__NEST:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__NEST, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__UPDATE_SOURCE_EXPR_LIST:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__UPDATE_SOURCE_EXPR_LIST, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__COLUMN_DEFINITION_REGULAR:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__COLUMN_DEFINITION_REGULAR, msgs);
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
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__DEPENDENCIES:
					return ((InternalEList)getDependencies()).basicRemove(otherEnd, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__DATA_TYPE:
					return basicSetDataType(null, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUES_ROW:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUES_ROW, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__ORDER_BY_VALUE_EXPR:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__ORDER_BY_VALUE_EXPR, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__RESULT_COLUMN:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__RESULT_COLUMN, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BASIC_RIGHT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BASIC_RIGHT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BASIC_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BASIC_LEFT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_PATTERN:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_PATTERN, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_MATCHING:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_MATCHING, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__PREDICATE_NULL:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__PREDICATE_NULL, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_LIST_RIGHT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_LIST_RIGHT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_LIST_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_LIST_LEFT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_ROW_SELECT_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_ROW_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_SELECT_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__QUANTIFIED_ROW_SELECT_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__QUANTIFIED_ROW_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__QUANTIFIED_VALUE_SELECT_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__QUANTIFIED_VALUE_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_LEFT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_RIGHT1:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_RIGHT1, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_RIGHT2:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_RIGHT2, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CAST:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CAST, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_FUNCTION:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_FUNCTION, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_COMBINED_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_COMBINED_LEFT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_COMBINED_RIGHT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_COMBINED_RIGHT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__GROUPING_EXPR:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__GROUPING_EXPR, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_ELSE:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_ELSE, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SEARCH_CONTENT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SEARCH_CONTENT, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_ESCAPE:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_ESCAPE, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_LABELED_DURATION:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_LABELED_DURATION, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__NEST:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__NEST, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__UPDATE_SOURCE_EXPR_LIST:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__UPDATE_SOURCE_EXPR_LIST, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR:
					return basicSetValueExpr(null, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__COLUMN_DEFINITION_REGULAR:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__COLUMN_DEFINITION_REGULAR, msgs);
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
    public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUES_ROW:
					return eContainer.eInverseRemove(this, SQLQueryPackage.VALUES_ROW__EXPR_LIST, ValuesRow.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__ORDER_BY_VALUE_EXPR:
					return eContainer.eInverseRemove(this, SQLQueryPackage.ORDER_BY_VALUE_EXPRESSION__VALUE_EXPR, OrderByValueExpression.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__RESULT_COLUMN:
					return eContainer.eInverseRemove(this, SQLQueryPackage.RESULT_COLUMN__VALUE_EXPR, ResultColumn.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BASIC_RIGHT:
					return eContainer.eInverseRemove(this, SQLQueryPackage.PREDICATE_BASIC__RIGHT_VALUE_EXPR, PredicateBasic.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BASIC_LEFT:
					return eContainer.eInverseRemove(this, SQLQueryPackage.PREDICATE_BASIC__LEFT_VALUE_EXPR, PredicateBasic.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_PATTERN:
					return eContainer.eInverseRemove(this, SQLQueryPackage.PREDICATE_LIKE__PATTERN_VALUE_EXPR, PredicateLike.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_MATCHING:
					return eContainer.eInverseRemove(this, SQLQueryPackage.PREDICATE_LIKE__MATCHING_VALUE_EXPR, PredicateLike.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__PREDICATE_NULL:
					return eContainer.eInverseRemove(this, SQLQueryPackage.PREDICATE_IS_NULL__VALUE_EXPR, PredicateIsNull.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_LIST_RIGHT:
					return eContainer.eInverseRemove(this, SQLQueryPackage.PREDICATE_IN_VALUE_LIST__VALUE_EXPR_LIST, PredicateInValueList.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_LIST_LEFT:
					return eContainer.eInverseRemove(this, SQLQueryPackage.PREDICATE_IN_VALUE_LIST__VALUE_EXPR, PredicateInValueList.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_ROW_SELECT_LEFT:
					return eContainer.eInverseRemove(this, SQLQueryPackage.PREDICATE_IN_VALUE_ROW_SELECT__VALUE_EXPR_LIST, PredicateInValueRowSelect.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_SELECT_LEFT:
					return eContainer.eInverseRemove(this, SQLQueryPackage.PREDICATE_IN_VALUE_SELECT__VALUE_EXPR, PredicateInValueSelect.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__QUANTIFIED_ROW_SELECT_LEFT:
					return eContainer.eInverseRemove(this, SQLQueryPackage.PREDICATE_QUANTIFIED_ROW_SELECT__VALUE_EXPR_LIST, PredicateQuantifiedRowSelect.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__QUANTIFIED_VALUE_SELECT_LEFT:
					return eContainer.eInverseRemove(this, SQLQueryPackage.PREDICATE_QUANTIFIED_VALUE_SELECT__VALUE_EXPR, PredicateQuantifiedValueSelect.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_LEFT:
					return eContainer.eInverseRemove(this, SQLQueryPackage.PREDICATE_BETWEEN__LEFT_VALUE_EXPR, PredicateBetween.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_RIGHT1:
					return eContainer.eInverseRemove(this, SQLQueryPackage.PREDICATE_BETWEEN__RIGHT_VALUE_EXPR1, PredicateBetween.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_RIGHT2:
					return eContainer.eInverseRemove(this, SQLQueryPackage.PREDICATE_BETWEEN__RIGHT_VALUE_EXPR2, PredicateBetween.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CAST:
					return eContainer.eInverseRemove(this, SQLQueryPackage.VALUE_EXPRESSION_CAST__VALUE_EXPR, ValueExpressionCast.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_FUNCTION:
					return eContainer.eInverseRemove(this, SQLQueryPackage.VALUE_EXPRESSION_FUNCTION__PARAMETER_LIST, ValueExpressionFunction.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_COMBINED_LEFT:
					return eContainer.eInverseRemove(this, SQLQueryPackage.VALUE_EXPRESSION_COMBINED__LEFT_VALUE_EXPR, ValueExpressionCombined.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_COMBINED_RIGHT:
					return eContainer.eInverseRemove(this, SQLQueryPackage.VALUE_EXPRESSION_COMBINED__RIGHT_VALUE_EXPR, ValueExpressionCombined.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__GROUPING_EXPR:
					return eContainer.eInverseRemove(this, SQLQueryPackage.GROUPING_EXPRESSION__VALUE_EXPR, GroupingExpression.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_ELSE:
					return eContainer.eInverseRemove(this, SQLQueryPackage.VALUE_EXPRESSION_CASE_ELSE__VALUE_EXPR, ValueExpressionCaseElse.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE:
					return eContainer.eInverseRemove(this, SQLQueryPackage.VALUE_EXPRESSION_CASE_SIMPLE__VALUE_EXPR, ValueExpressionCaseSimple.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
					return eContainer.eInverseRemove(this, SQLQueryPackage.VALUE_EXPRESSION_CASE_SIMPLE_CONTENT__WHEN_VALUE_EXPR, ValueExpressionCaseSimpleContent.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
					return eContainer.eInverseRemove(this, SQLQueryPackage.VALUE_EXPRESSION_CASE_SIMPLE_CONTENT__RESULT_VALUE_EXPR, ValueExpressionCaseSimpleContent.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SEARCH_CONTENT:
					return eContainer.eInverseRemove(this, SQLQueryPackage.VALUE_EXPRESSION_CASE_SEARCH_CONTENT__VALUE_EXPR, ValueExpressionCaseSearchContent.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_ESCAPE:
					return eContainer.eInverseRemove(this, SQLQueryPackage.PREDICATE_LIKE__ESCAPE_VALUE_EXPR, PredicateLike.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_LABELED_DURATION:
					return eContainer.eInverseRemove(this, SQLQueryPackage.VALUE_EXPRESSION_LABELED_DURATION__VALUE_EXPR, ValueExpressionLabeledDuration.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__NEST:
					return eContainer.eInverseRemove(this, SQLQueryPackage.VALUE_EXPRESSION_NESTED__NESTED_VALUE_EXPR, ValueExpressionNested.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__UPDATE_SOURCE_EXPR_LIST:
					return eContainer.eInverseRemove(this, SQLQueryPackage.UPDATE_SOURCE_EXPR_LIST__VALUE_EXPR_LIST, UpdateSourceExprList.class, msgs);
				case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__COLUMN_DEFINITION_REGULAR:
					return eContainer.eInverseRemove(this, SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_REGULAR__COLUMN_DEFINITION_DEFAULT, XMLTableColumnDefinitionRegular.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__EANNOTATIONS:
				return getEAnnotations();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__NAME:
				return getName();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__DEPENDENCIES:
				return getDependencies();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__DESCRIPTION:
				return getDescription();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LABEL:
				return getLabel();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__UNARY_OPERATOR:
				return getUnaryOperator();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__DATA_TYPE:
				return getDataType();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUES_ROW:
				return getValuesRow();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__ORDER_BY_VALUE_EXPR:
				return getOrderByValueExpr();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__RESULT_COLUMN:
				return getResultColumn();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BASIC_RIGHT:
				return getBasicRight();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BASIC_LEFT:
				return getBasicLeft();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_PATTERN:
				return getLikePattern();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_MATCHING:
				return getLikeMatching();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__PREDICATE_NULL:
				return getPredicateNull();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_LIST_RIGHT:
				return getInValueListRight();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_LIST_LEFT:
				return getInValueListLeft();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_ROW_SELECT_LEFT:
				return getInValueRowSelectLeft();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_SELECT_LEFT:
				return getInValueSelectLeft();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__QUANTIFIED_ROW_SELECT_LEFT:
				return getQuantifiedRowSelectLeft();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__QUANTIFIED_VALUE_SELECT_LEFT:
				return getQuantifiedValueSelectLeft();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_LEFT:
				return getBetweenLeft();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_RIGHT1:
				return getBetweenRight1();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_RIGHT2:
				return getBetweenRight2();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CAST:
				return getValueExprCast();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_FUNCTION:
				return getValueExprFunction();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_COMBINED_LEFT:
				return getValueExprCombinedLeft();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_COMBINED_RIGHT:
				return getValueExprCombinedRight();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__GROUPING_EXPR:
				return getGroupingExpr();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_ELSE:
				return getValueExprCaseElse();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE:
				return getValueExprCaseSimple();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
				return getValueExprCaseSimpleContentWhen();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
				return getValueExprCaseSimpleContentResult();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SEARCH_CONTENT:
				return getValueExprCaseSearchContent();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_ESCAPE:
				return getLikeEscape();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_LABELED_DURATION:
				return getValueExprLabeledDuration();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__NEST:
				return getNest();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__UPDATE_SOURCE_EXPR_LIST:
				return getUpdateSourceExprList();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR:
				return getValueExpr();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__COLUMN_DEFINITION_REGULAR:
				return getColumnDefinitionRegular();
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
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__NAME:
				setName((String)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LABEL:
				setLabel((String)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__UNARY_OPERATOR:
				setUnaryOperator((ValueExpressionUnaryOperator)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUES_ROW:
				setValuesRow((ValuesRow)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__ORDER_BY_VALUE_EXPR:
				setOrderByValueExpr((OrderByValueExpression)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__RESULT_COLUMN:
				setResultColumn((ResultColumn)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BASIC_RIGHT:
				setBasicRight((PredicateBasic)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BASIC_LEFT:
				setBasicLeft((PredicateBasic)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_PATTERN:
				setLikePattern((PredicateLike)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_MATCHING:
				setLikeMatching((PredicateLike)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__PREDICATE_NULL:
				setPredicateNull((PredicateIsNull)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_LIST_RIGHT:
				setInValueListRight((PredicateInValueList)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_LIST_LEFT:
				setInValueListLeft((PredicateInValueList)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_ROW_SELECT_LEFT:
				setInValueRowSelectLeft((PredicateInValueRowSelect)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_SELECT_LEFT:
				setInValueSelectLeft((PredicateInValueSelect)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__QUANTIFIED_ROW_SELECT_LEFT:
				setQuantifiedRowSelectLeft((PredicateQuantifiedRowSelect)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__QUANTIFIED_VALUE_SELECT_LEFT:
				setQuantifiedValueSelectLeft((PredicateQuantifiedValueSelect)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_LEFT:
				setBetweenLeft((PredicateBetween)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_RIGHT1:
				setBetweenRight1((PredicateBetween)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_RIGHT2:
				setBetweenRight2((PredicateBetween)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CAST:
				setValueExprCast((ValueExpressionCast)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_FUNCTION:
				setValueExprFunction((ValueExpressionFunction)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_COMBINED_LEFT:
				setValueExprCombinedLeft((ValueExpressionCombined)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_COMBINED_RIGHT:
				setValueExprCombinedRight((ValueExpressionCombined)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__GROUPING_EXPR:
				setGroupingExpr((GroupingExpression)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_ELSE:
				setValueExprCaseElse((ValueExpressionCaseElse)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE:
				setValueExprCaseSimple((ValueExpressionCaseSimple)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
				setValueExprCaseSimpleContentWhen((ValueExpressionCaseSimpleContent)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
				setValueExprCaseSimpleContentResult((ValueExpressionCaseSimpleContent)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SEARCH_CONTENT:
				setValueExprCaseSearchContent((ValueExpressionCaseSearchContent)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_ESCAPE:
				setLikeEscape((PredicateLike)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_LABELED_DURATION:
				setValueExprLabeledDuration((ValueExpressionLabeledDuration)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__NEST:
				setNest((ValueExpressionNested)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__UPDATE_SOURCE_EXPR_LIST:
				setUpdateSourceExprList((UpdateSourceExprList)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR:
				setValueExpr((QueryValueExpression)newValue);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__COLUMN_DEFINITION_REGULAR:
				setColumnDefinitionRegular((XMLTableColumnDefinitionRegular)newValue);
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
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__DEPENDENCIES:
				getDependencies().clear();
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__UNARY_OPERATOR:
				setUnaryOperator(UNARY_OPERATOR_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__DATA_TYPE:
				setDataType((DataType)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUES_ROW:
				setValuesRow((ValuesRow)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__ORDER_BY_VALUE_EXPR:
				setOrderByValueExpr((OrderByValueExpression)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__RESULT_COLUMN:
				setResultColumn((ResultColumn)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BASIC_RIGHT:
				setBasicRight((PredicateBasic)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BASIC_LEFT:
				setBasicLeft((PredicateBasic)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_PATTERN:
				setLikePattern((PredicateLike)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_MATCHING:
				setLikeMatching((PredicateLike)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__PREDICATE_NULL:
				setPredicateNull((PredicateIsNull)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_LIST_RIGHT:
				setInValueListRight((PredicateInValueList)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_LIST_LEFT:
				setInValueListLeft((PredicateInValueList)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_ROW_SELECT_LEFT:
				setInValueRowSelectLeft((PredicateInValueRowSelect)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_SELECT_LEFT:
				setInValueSelectLeft((PredicateInValueSelect)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__QUANTIFIED_ROW_SELECT_LEFT:
				setQuantifiedRowSelectLeft((PredicateQuantifiedRowSelect)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__QUANTIFIED_VALUE_SELECT_LEFT:
				setQuantifiedValueSelectLeft((PredicateQuantifiedValueSelect)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_LEFT:
				setBetweenLeft((PredicateBetween)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_RIGHT1:
				setBetweenRight1((PredicateBetween)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_RIGHT2:
				setBetweenRight2((PredicateBetween)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CAST:
				setValueExprCast((ValueExpressionCast)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_FUNCTION:
				setValueExprFunction((ValueExpressionFunction)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_COMBINED_LEFT:
				setValueExprCombinedLeft((ValueExpressionCombined)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_COMBINED_RIGHT:
				setValueExprCombinedRight((ValueExpressionCombined)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__GROUPING_EXPR:
				setGroupingExpr((GroupingExpression)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_ELSE:
				setValueExprCaseElse((ValueExpressionCaseElse)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE:
				setValueExprCaseSimple((ValueExpressionCaseSimple)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
				setValueExprCaseSimpleContentWhen((ValueExpressionCaseSimpleContent)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
				setValueExprCaseSimpleContentResult((ValueExpressionCaseSimpleContent)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SEARCH_CONTENT:
				setValueExprCaseSearchContent((ValueExpressionCaseSearchContent)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_ESCAPE:
				setLikeEscape((PredicateLike)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_LABELED_DURATION:
				setValueExprLabeledDuration((ValueExpressionLabeledDuration)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__NEST:
				setNest((ValueExpressionNested)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__UPDATE_SOURCE_EXPR_LIST:
				setUpdateSourceExprList((UpdateSourceExprList)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR:
				setValueExpr((QueryValueExpression)null);
				return;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__COLUMN_DEFINITION_REGULAR:
				setColumnDefinitionRegular((XMLTableColumnDefinitionRegular)null);
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
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__UNARY_OPERATOR:
				return unaryOperator != UNARY_OPERATOR_EDEFAULT;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__DATA_TYPE:
				return dataType != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUES_ROW:
				return getValuesRow() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__ORDER_BY_VALUE_EXPR:
				return getOrderByValueExpr() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__RESULT_COLUMN:
				return getResultColumn() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BASIC_RIGHT:
				return getBasicRight() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BASIC_LEFT:
				return getBasicLeft() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_PATTERN:
				return getLikePattern() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_MATCHING:
				return getLikeMatching() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__PREDICATE_NULL:
				return getPredicateNull() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_LIST_RIGHT:
				return getInValueListRight() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_LIST_LEFT:
				return getInValueListLeft() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_ROW_SELECT_LEFT:
				return getInValueRowSelectLeft() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__IN_VALUE_SELECT_LEFT:
				return getInValueSelectLeft() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__QUANTIFIED_ROW_SELECT_LEFT:
				return getQuantifiedRowSelectLeft() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__QUANTIFIED_VALUE_SELECT_LEFT:
				return getQuantifiedValueSelectLeft() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_LEFT:
				return getBetweenLeft() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_RIGHT1:
				return getBetweenRight1() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__BETWEEN_RIGHT2:
				return getBetweenRight2() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CAST:
				return getValueExprCast() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_FUNCTION:
				return getValueExprFunction() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_COMBINED_LEFT:
				return getValueExprCombinedLeft() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_COMBINED_RIGHT:
				return getValueExprCombinedRight() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__GROUPING_EXPR:
				return getGroupingExpr() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_ELSE:
				return getValueExprCaseElse() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE:
				return getValueExprCaseSimple() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
				return getValueExprCaseSimpleContentWhen() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
				return getValueExprCaseSimpleContentResult() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_CASE_SEARCH_CONTENT:
				return getValueExprCaseSearchContent() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__LIKE_ESCAPE:
				return getLikeEscape() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR_LABELED_DURATION:
				return getValueExprLabeledDuration() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__NEST:
				return getNest() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__UPDATE_SOURCE_EXPR_LIST:
				return getUpdateSourceExprList() != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__VALUE_EXPR:
				return valueExpr != null;
			case SQLXMLQueryPackage.XML_TABLE_COLUMN_DEFINITION_DEFAULT__COLUMN_DEFINITION_REGULAR:
				return getColumnDefinitionRegular() != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //XMLTableColumnDefinitionDefaultImpl