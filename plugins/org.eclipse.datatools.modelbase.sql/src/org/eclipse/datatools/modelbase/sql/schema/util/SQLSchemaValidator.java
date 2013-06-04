/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.schema.util;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.eclipse.datatools.modelbase.sql.schema.Catalog;
import org.eclipse.datatools.modelbase.sql.schema.Comment;
import org.eclipse.datatools.modelbase.sql.schema.Database;
import org.eclipse.datatools.modelbase.sql.schema.Dependency;
import org.eclipse.datatools.modelbase.sql.schema.Event;
import org.eclipse.datatools.modelbase.sql.schema.GenerateType;
import org.eclipse.datatools.modelbase.sql.schema.IdentitySpecifier;
import org.eclipse.datatools.modelbase.sql.schema.ObjectExtension;
import org.eclipse.datatools.modelbase.sql.schema.ReferentialActionType;
import org.eclipse.datatools.modelbase.sql.schema.SQLObject;
import org.eclipse.datatools.modelbase.sql.schema.SQLSchemaPackage;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.Sequence;
import org.eclipse.datatools.modelbase.sql.schema.TypedElement;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.datatools.modelbase.sql.schema.SQLSchemaPackage
 * @generated
 */
public class SQLSchemaValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SQLSchemaValidator INSTANCE = new SQLSchemaValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.datatools.modelbase.sql.schema";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLSchemaValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SQLSchemaPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SQLSchemaPackage.IDENTITY_SPECIFIER:
				return validateIdentitySpecifier((IdentitySpecifier)value, diagnostics, context);
			case SQLSchemaPackage.TYPED_ELEMENT:
				return validateTypedElement((TypedElement)value, diagnostics, context);
			case SQLSchemaPackage.DEPENDENCY:
				return validateDependency((Dependency)value, diagnostics, context);
			case SQLSchemaPackage.SCHEMA:
				return validateSchema((Schema)value, diagnostics, context);
			case SQLSchemaPackage.SQL_OBJECT:
				return validateSQLObject((SQLObject)value, diagnostics, context);
			case SQLSchemaPackage.SEQUENCE:
				return validateSequence((Sequence)value, diagnostics, context);
			case SQLSchemaPackage.DATABASE:
				return validateDatabase((Database)value, diagnostics, context);
			case SQLSchemaPackage.EVENT:
				return validateEvent((Event)value, diagnostics, context);
			case SQLSchemaPackage.COMMENT:
				return validateComment((Comment)value, diagnostics, context);
			case SQLSchemaPackage.CATALOG:
				return validateCatalog((Catalog)value, diagnostics, context);
			case SQLSchemaPackage.OBJECT_EXTENSION:
				return validateObjectExtension((ObjectExtension)value, diagnostics, context);
			case SQLSchemaPackage.GENERATE_TYPE:
				return validateGenerateType((GenerateType)value, diagnostics, context);
			case SQLSchemaPackage.REFERENTIAL_ACTION_TYPE:
				return validateReferentialActionType((ReferentialActionType)value, diagnostics, context);
			case SQLSchemaPackage.DATE:
				return validateDate((Date)value, diagnostics, context);
			case SQLSchemaPackage.LIST:
				return validateList((List)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentitySpecifier(IdentitySpecifier identitySpecifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)identitySpecifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)identitySpecifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)identitySpecifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)identitySpecifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)identitySpecifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)identitySpecifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)identitySpecifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)identitySpecifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)identitySpecifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateSQLObject_WellFormedName(identitySpecifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedElement(TypedElement typedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)typedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSQLObject_WellFormedName(typedElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependency(Dependency dependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)dependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateSQLObject_WellFormedName(dependency, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchema(Schema schema, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)schema, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)schema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)schema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)schema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)schema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)schema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)schema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)schema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)schema, diagnostics, context);
		if (result || diagnostics != null) result &= validateSQLObject_WellFormedName(schema, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSQLObject(SQLObject sqlObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)sqlObject, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)sqlObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)sqlObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)sqlObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)sqlObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)sqlObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)sqlObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)sqlObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)sqlObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateSQLObject_WellFormedName(sqlObject, diagnostics, context);
		return result;
	}

	/**
	 * Validates the WellFormedName constraint of '<em>SQL Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSQLObject_WellFormedName(SQLObject sqlObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WellFormedName", getObjectLabel(sqlObject, context) },
						 new Object[] { sqlObject },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequence(Sequence sequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)sequence, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validateSQLObject_WellFormedName(sequence, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabase(Database database, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)database, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)database, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)database, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)database, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)database, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)database, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)database, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)database, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)database, diagnostics, context);
		if (result || diagnostics != null) result &= validateSQLObject_WellFormedName(database, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)event, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)event, diagnostics, context);
		if (result || diagnostics != null) result &= validateSQLObject_WellFormedName(event, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)comment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalog(Catalog catalog, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)catalog, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)catalog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)catalog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)catalog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)catalog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)catalog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)catalog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)catalog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)catalog, diagnostics, context);
		if (result || diagnostics != null) result &= validateSQLObject_WellFormedName(catalog, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectExtension(ObjectExtension objectExtension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)objectExtension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenerateType(GenerateType generateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferentialActionType(ReferentialActionType referentialActionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDate(Date date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateList(List list, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SQLSchemaValidator
