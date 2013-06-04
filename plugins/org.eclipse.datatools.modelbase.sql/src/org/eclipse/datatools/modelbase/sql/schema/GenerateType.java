/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.schema;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Generate Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Reference: 5WD-02-Foundation-2002-12 4.14.4 Identity columns
 * 
 * <!-- end-model-doc -->
 * @see org.eclipse.datatools.modelbase.sql.schema.SQLSchemaPackage#getGenerateType()
 * @model
 * @generated
 */
public enum GenerateType implements Enumerator
{
	/**
	 * The '<em><b>DEFAULT GENERATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_GENERATED_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT_GENERATED(0, "DEFAULT_GENERATED", "DEFAULT_GENERATED"),
	/**
	 * The '<em><b>ALWAYS GENERATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALWAYS_GENERATED_VALUE
	 * @generated
	 * @ordered
	 */
	ALWAYS_GENERATED(1, "ALWAYS_GENERATED", "ALWAYS_GENERATED");
	/**
	 * The '<em><b>DEFAULT GENERATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEFAULT GENERATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_GENERATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_GENERATED_VALUE = 0;

	/**
	 * The '<em><b>ALWAYS GENERATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALWAYS GENERATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALWAYS_GENERATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALWAYS_GENERATED_VALUE = 1;

	/**
	 * An array of all the '<em><b>Generate Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GenerateType[] VALUES_ARRAY =
		new GenerateType[] {
			DEFAULT_GENERATED,
			ALWAYS_GENERATED,
		};

	/**
	 * A public read-only list of all the '<em><b>Generate Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GenerateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Generate Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenerateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GenerateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Generate Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenerateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GenerateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Generate Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenerateType get(int value) {
		switch (value) {
			case DEFAULT_GENERATED_VALUE: return DEFAULT_GENERATED;
			case ALWAYS_GENERATED_VALUE: return ALWAYS_GENERATED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GenerateType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
}
