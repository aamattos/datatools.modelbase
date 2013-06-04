/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.datatypes.util;

import org.eclipse.datatools.modelbase.sql.datatypes.*;
import org.eclipse.datatools.modelbase.sql.datatypes.ApproximateNumericDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.ArrayDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.AttributeDefinition;
import org.eclipse.datatools.modelbase.sql.datatypes.BinaryStringDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.BooleanDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.CharacterSet;
import org.eclipse.datatools.modelbase.sql.datatypes.CharacterStringDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.CollectionDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.ConstructedDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.DataLinkDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.DataType;
import org.eclipse.datatools.modelbase.sql.datatypes.DateDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.DistinctUserDefinedType;
import org.eclipse.datatools.modelbase.sql.datatypes.Domain;
import org.eclipse.datatools.modelbase.sql.datatypes.ElementType;
import org.eclipse.datatools.modelbase.sql.datatypes.ExactNumericDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.Field;
import org.eclipse.datatools.modelbase.sql.datatypes.FixedPrecisionDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.IntegerDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.IntervalDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.MultisetDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.NumericalDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.PredefinedDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.ReferenceDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.RowDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage;
import org.eclipse.datatools.modelbase.sql.datatypes.StructuredUserDefinedType;
import org.eclipse.datatools.modelbase.sql.datatypes.TimeDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.UserDefinedType;
import org.eclipse.datatools.modelbase.sql.datatypes.UserDefinedTypeOrdering;
import org.eclipse.datatools.modelbase.sql.datatypes.XMLDataType;
import org.eclipse.datatools.modelbase.sql.schema.SQLObject;
import org.eclipse.datatools.modelbase.sql.schema.TypedElement;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage
 * @generated
 */
public class SQLDataTypesSwitch<T> extends Switch<T>  {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SQLDataTypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLDataTypesSwitch() {
		if (modelPackage == null) {
			modelPackage = SQLDataTypesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SQLDataTypesPackage.USER_DEFINED_TYPE: {
				UserDefinedType userDefinedType = (UserDefinedType)theEObject;
				T result = caseUserDefinedType(userDefinedType);
				if (result == null) result = caseDataType(userDefinedType);
				if (result == null) result = caseSQLObject(userDefinedType);
				if (result == null) result = caseENamedElement(userDefinedType);
				if (result == null) result = caseEModelElement(userDefinedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseSQLObject(dataType);
				if (result == null) result = caseENamedElement(dataType);
				if (result == null) result = caseEModelElement(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.PREDEFINED_DATA_TYPE: {
				PredefinedDataType predefinedDataType = (PredefinedDataType)theEObject;
				T result = casePredefinedDataType(predefinedDataType);
				if (result == null) result = caseSQLDataType(predefinedDataType);
				if (result == null) result = caseDataType(predefinedDataType);
				if (result == null) result = caseSQLObject(predefinedDataType);
				if (result == null) result = caseENamedElement(predefinedDataType);
				if (result == null) result = caseEModelElement(predefinedDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.COLLECTION_DATA_TYPE: {
				CollectionDataType collectionDataType = (CollectionDataType)theEObject;
				T result = caseCollectionDataType(collectionDataType);
				if (result == null) result = caseConstructedDataType(collectionDataType);
				if (result == null) result = caseDataType(collectionDataType);
				if (result == null) result = caseSQLObject(collectionDataType);
				if (result == null) result = caseENamedElement(collectionDataType);
				if (result == null) result = caseEModelElement(collectionDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.NUMERICAL_DATA_TYPE: {
				NumericalDataType numericalDataType = (NumericalDataType)theEObject;
				T result = caseNumericalDataType(numericalDataType);
				if (result == null) result = casePredefinedDataType(numericalDataType);
				if (result == null) result = caseSQLDataType(numericalDataType);
				if (result == null) result = caseDataType(numericalDataType);
				if (result == null) result = caseSQLObject(numericalDataType);
				if (result == null) result = caseENamedElement(numericalDataType);
				if (result == null) result = caseEModelElement(numericalDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.CHARACTER_STRING_DATA_TYPE: {
				CharacterStringDataType characterStringDataType = (CharacterStringDataType)theEObject;
				T result = caseCharacterStringDataType(characterStringDataType);
				if (result == null) result = casePredefinedDataType(characterStringDataType);
				if (result == null) result = caseSQLDataType(characterStringDataType);
				if (result == null) result = caseDataType(characterStringDataType);
				if (result == null) result = caseSQLObject(characterStringDataType);
				if (result == null) result = caseENamedElement(characterStringDataType);
				if (result == null) result = caseEModelElement(characterStringDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.ROW_DATA_TYPE: {
				RowDataType rowDataType = (RowDataType)theEObject;
				T result = caseRowDataType(rowDataType);
				if (result == null) result = caseConstructedDataType(rowDataType);
				if (result == null) result = caseDataType(rowDataType);
				if (result == null) result = caseSQLObject(rowDataType);
				if (result == null) result = caseENamedElement(rowDataType);
				if (result == null) result = caseEModelElement(rowDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.ARRAY_DATA_TYPE: {
				ArrayDataType arrayDataType = (ArrayDataType)theEObject;
				T result = caseArrayDataType(arrayDataType);
				if (result == null) result = caseCollectionDataType(arrayDataType);
				if (result == null) result = caseConstructedDataType(arrayDataType);
				if (result == null) result = caseDataType(arrayDataType);
				if (result == null) result = caseSQLObject(arrayDataType);
				if (result == null) result = caseENamedElement(arrayDataType);
				if (result == null) result = caseEModelElement(arrayDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.MULTISET_DATA_TYPE: {
				MultisetDataType multisetDataType = (MultisetDataType)theEObject;
				T result = caseMultisetDataType(multisetDataType);
				if (result == null) result = caseCollectionDataType(multisetDataType);
				if (result == null) result = caseConstructedDataType(multisetDataType);
				if (result == null) result = caseDataType(multisetDataType);
				if (result == null) result = caseSQLObject(multisetDataType);
				if (result == null) result = caseENamedElement(multisetDataType);
				if (result == null) result = caseEModelElement(multisetDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.BOOLEAN_DATA_TYPE: {
				BooleanDataType booleanDataType = (BooleanDataType)theEObject;
				T result = caseBooleanDataType(booleanDataType);
				if (result == null) result = casePredefinedDataType(booleanDataType);
				if (result == null) result = caseSQLDataType(booleanDataType);
				if (result == null) result = caseDataType(booleanDataType);
				if (result == null) result = caseSQLObject(booleanDataType);
				if (result == null) result = caseENamedElement(booleanDataType);
				if (result == null) result = caseEModelElement(booleanDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.INTERVAL_DATA_TYPE: {
				IntervalDataType intervalDataType = (IntervalDataType)theEObject;
				T result = caseIntervalDataType(intervalDataType);
				if (result == null) result = casePredefinedDataType(intervalDataType);
				if (result == null) result = caseSQLDataType(intervalDataType);
				if (result == null) result = caseDataType(intervalDataType);
				if (result == null) result = caseSQLObject(intervalDataType);
				if (result == null) result = caseENamedElement(intervalDataType);
				if (result == null) result = caseEModelElement(intervalDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.BINARY_STRING_DATA_TYPE: {
				BinaryStringDataType binaryStringDataType = (BinaryStringDataType)theEObject;
				T result = caseBinaryStringDataType(binaryStringDataType);
				if (result == null) result = casePredefinedDataType(binaryStringDataType);
				if (result == null) result = caseSQLDataType(binaryStringDataType);
				if (result == null) result = caseDataType(binaryStringDataType);
				if (result == null) result = caseSQLObject(binaryStringDataType);
				if (result == null) result = caseENamedElement(binaryStringDataType);
				if (result == null) result = caseEModelElement(binaryStringDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.CHARACTER_SET: {
				CharacterSet characterSet = (CharacterSet)theEObject;
				T result = caseCharacterSet(characterSet);
				if (result == null) result = caseSQLObject(characterSet);
				if (result == null) result = caseENamedElement(characterSet);
				if (result == null) result = caseEModelElement(characterSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.TIME_DATA_TYPE: {
				TimeDataType timeDataType = (TimeDataType)theEObject;
				T result = caseTimeDataType(timeDataType);
				if (result == null) result = casePredefinedDataType(timeDataType);
				if (result == null) result = caseSQLDataType(timeDataType);
				if (result == null) result = caseDataType(timeDataType);
				if (result == null) result = caseSQLObject(timeDataType);
				if (result == null) result = caseENamedElement(timeDataType);
				if (result == null) result = caseEModelElement(timeDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.DISTINCT_USER_DEFINED_TYPE: {
				DistinctUserDefinedType distinctUserDefinedType = (DistinctUserDefinedType)theEObject;
				T result = caseDistinctUserDefinedType(distinctUserDefinedType);
				if (result == null) result = caseUserDefinedType(distinctUserDefinedType);
				if (result == null) result = caseDataType(distinctUserDefinedType);
				if (result == null) result = caseSQLObject(distinctUserDefinedType);
				if (result == null) result = caseENamedElement(distinctUserDefinedType);
				if (result == null) result = caseEModelElement(distinctUserDefinedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.STRUCTURED_USER_DEFINED_TYPE: {
				StructuredUserDefinedType structuredUserDefinedType = (StructuredUserDefinedType)theEObject;
				T result = caseStructuredUserDefinedType(structuredUserDefinedType);
				if (result == null) result = caseUserDefinedType(structuredUserDefinedType);
				if (result == null) result = caseDataType(structuredUserDefinedType);
				if (result == null) result = caseSQLObject(structuredUserDefinedType);
				if (result == null) result = caseENamedElement(structuredUserDefinedType);
				if (result == null) result = caseEModelElement(structuredUserDefinedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.ATTRIBUTE_DEFINITION: {
				AttributeDefinition attributeDefinition = (AttributeDefinition)theEObject;
				T result = caseAttributeDefinition(attributeDefinition);
				if (result == null) result = caseTypedElement(attributeDefinition);
				if (result == null) result = caseSQLObject(attributeDefinition);
				if (result == null) result = caseENamedElement(attributeDefinition);
				if (result == null) result = caseEModelElement(attributeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.FIXED_PRECISION_DATA_TYPE: {
				FixedPrecisionDataType fixedPrecisionDataType = (FixedPrecisionDataType)theEObject;
				T result = caseFixedPrecisionDataType(fixedPrecisionDataType);
				if (result == null) result = caseExactNumericDataType(fixedPrecisionDataType);
				if (result == null) result = caseNumericalDataType(fixedPrecisionDataType);
				if (result == null) result = casePredefinedDataType(fixedPrecisionDataType);
				if (result == null) result = caseSQLDataType(fixedPrecisionDataType);
				if (result == null) result = caseDataType(fixedPrecisionDataType);
				if (result == null) result = caseSQLObject(fixedPrecisionDataType);
				if (result == null) result = caseENamedElement(fixedPrecisionDataType);
				if (result == null) result = caseEModelElement(fixedPrecisionDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.DOMAIN: {
				Domain domain = (Domain)theEObject;
				T result = caseDomain(domain);
				if (result == null) result = caseDistinctUserDefinedType(domain);
				if (result == null) result = caseUserDefinedType(domain);
				if (result == null) result = caseDataType(domain);
				if (result == null) result = caseSQLObject(domain);
				if (result == null) result = caseENamedElement(domain);
				if (result == null) result = caseEModelElement(domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = caseTypedElement(field);
				if (result == null) result = caseSQLObject(field);
				if (result == null) result = caseENamedElement(field);
				if (result == null) result = caseEModelElement(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.REFERENCE_DATA_TYPE: {
				ReferenceDataType referenceDataType = (ReferenceDataType)theEObject;
				T result = caseReferenceDataType(referenceDataType);
				if (result == null) result = caseConstructedDataType(referenceDataType);
				if (result == null) result = caseDataType(referenceDataType);
				if (result == null) result = caseSQLObject(referenceDataType);
				if (result == null) result = caseENamedElement(referenceDataType);
				if (result == null) result = caseEModelElement(referenceDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.CONSTRUCTED_DATA_TYPE: {
				ConstructedDataType constructedDataType = (ConstructedDataType)theEObject;
				T result = caseConstructedDataType(constructedDataType);
				if (result == null) result = caseDataType(constructedDataType);
				if (result == null) result = caseSQLObject(constructedDataType);
				if (result == null) result = caseENamedElement(constructedDataType);
				if (result == null) result = caseEModelElement(constructedDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.SQL_DATA_TYPE: {
				SQLDataType sqlDataType = (SQLDataType)theEObject;
				T result = caseSQLDataType(sqlDataType);
				if (result == null) result = caseDataType(sqlDataType);
				if (result == null) result = caseSQLObject(sqlDataType);
				if (result == null) result = caseENamedElement(sqlDataType);
				if (result == null) result = caseEModelElement(sqlDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.DATA_LINK_DATA_TYPE: {
				DataLinkDataType dataLinkDataType = (DataLinkDataType)theEObject;
				T result = caseDataLinkDataType(dataLinkDataType);
				if (result == null) result = casePredefinedDataType(dataLinkDataType);
				if (result == null) result = caseSQLDataType(dataLinkDataType);
				if (result == null) result = caseDataType(dataLinkDataType);
				if (result == null) result = caseSQLObject(dataLinkDataType);
				if (result == null) result = caseENamedElement(dataLinkDataType);
				if (result == null) result = caseEModelElement(dataLinkDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.USER_DEFINED_TYPE_ORDERING: {
				UserDefinedTypeOrdering userDefinedTypeOrdering = (UserDefinedTypeOrdering)theEObject;
				T result = caseUserDefinedTypeOrdering(userDefinedTypeOrdering);
				if (result == null) result = caseSQLObject(userDefinedTypeOrdering);
				if (result == null) result = caseENamedElement(userDefinedTypeOrdering);
				if (result == null) result = caseEModelElement(userDefinedTypeOrdering);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.DATE_DATA_TYPE: {
				DateDataType dateDataType = (DateDataType)theEObject;
				T result = caseDateDataType(dateDataType);
				if (result == null) result = casePredefinedDataType(dateDataType);
				if (result == null) result = caseSQLDataType(dateDataType);
				if (result == null) result = caseDataType(dateDataType);
				if (result == null) result = caseSQLObject(dateDataType);
				if (result == null) result = caseENamedElement(dateDataType);
				if (result == null) result = caseEModelElement(dateDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.EXACT_NUMERIC_DATA_TYPE: {
				ExactNumericDataType exactNumericDataType = (ExactNumericDataType)theEObject;
				T result = caseExactNumericDataType(exactNumericDataType);
				if (result == null) result = caseNumericalDataType(exactNumericDataType);
				if (result == null) result = casePredefinedDataType(exactNumericDataType);
				if (result == null) result = caseSQLDataType(exactNumericDataType);
				if (result == null) result = caseDataType(exactNumericDataType);
				if (result == null) result = caseSQLObject(exactNumericDataType);
				if (result == null) result = caseENamedElement(exactNumericDataType);
				if (result == null) result = caseEModelElement(exactNumericDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.APPROXIMATE_NUMERIC_DATA_TYPE: {
				ApproximateNumericDataType approximateNumericDataType = (ApproximateNumericDataType)theEObject;
				T result = caseApproximateNumericDataType(approximateNumericDataType);
				if (result == null) result = caseNumericalDataType(approximateNumericDataType);
				if (result == null) result = casePredefinedDataType(approximateNumericDataType);
				if (result == null) result = caseSQLDataType(approximateNumericDataType);
				if (result == null) result = caseDataType(approximateNumericDataType);
				if (result == null) result = caseSQLObject(approximateNumericDataType);
				if (result == null) result = caseENamedElement(approximateNumericDataType);
				if (result == null) result = caseEModelElement(approximateNumericDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.INTEGER_DATA_TYPE: {
				IntegerDataType integerDataType = (IntegerDataType)theEObject;
				T result = caseIntegerDataType(integerDataType);
				if (result == null) result = caseExactNumericDataType(integerDataType);
				if (result == null) result = caseNumericalDataType(integerDataType);
				if (result == null) result = casePredefinedDataType(integerDataType);
				if (result == null) result = caseSQLDataType(integerDataType);
				if (result == null) result = caseDataType(integerDataType);
				if (result == null) result = caseSQLObject(integerDataType);
				if (result == null) result = caseENamedElement(integerDataType);
				if (result == null) result = caseEModelElement(integerDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.XML_DATA_TYPE: {
				XMLDataType xmlDataType = (XMLDataType)theEObject;
				T result = caseXMLDataType(xmlDataType);
				if (result == null) result = casePredefinedDataType(xmlDataType);
				if (result == null) result = caseSQLDataType(xmlDataType);
				if (result == null) result = caseDataType(xmlDataType);
				if (result == null) result = caseSQLObject(xmlDataType);
				if (result == null) result = caseENamedElement(xmlDataType);
				if (result == null) result = caseEModelElement(xmlDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SQLDataTypesPackage.ELEMENT_TYPE: {
				ElementType elementType = (ElementType)theEObject;
				T result = caseElementType(elementType);
				if (result == null) result = caseTypedElement(elementType);
				if (result == null) result = caseSQLObject(elementType);
				if (result == null) result = caseENamedElement(elementType);
				if (result == null) result = caseEModelElement(elementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Defined Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Defined Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDefinedType(UserDefinedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predefined Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predefined Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredefinedDataType(PredefinedDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionDataType(CollectionDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numerical Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numerical Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericalDataType(NumericalDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character String Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character String Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterStringDataType(CharacterStringDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRowDataType(RowDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayDataType(ArrayDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiset Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiset Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultisetDataType(MultisetDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanDataType(BooleanDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntervalDataType(IntervalDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary String Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary String Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryStringDataType(BinaryStringDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterSet(CharacterSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeDataType(TimeDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distinct User Defined Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distinct User Defined Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistinctUserDefinedType(DistinctUserDefinedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured User Defined Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured User Defined Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredUserDefinedType(StructuredUserDefinedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDefinition(AttributeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Precision Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Precision Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedPrecisionDataType(FixedPrecisionDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomain(Domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceDataType(ReferenceDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructed Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructed Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructedDataType(ConstructedDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SQL Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SQL Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSQLDataType(SQLDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Link Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Link Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataLinkDataType(DataLinkDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Defined Type Ordering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Defined Type Ordering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDefinedTypeOrdering(UserDefinedTypeOrdering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateDataType(DateDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exact Numeric Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exact Numeric Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExactNumericDataType(ExactNumericDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Approximate Numeric Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Approximate Numeric Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApproximateNumericDataType(ApproximateNumericDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerDataType(IntegerDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLDataType(XMLDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementType(ElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEModelElement(EModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENamedElement(ENamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SQL Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SQL Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSQLObject(SQLObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SQLDataTypesSwitch
