/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.datatypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interval Qualifier Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Reference: 5WD-02-Foundation-2002-12 4.6.2 Intervals
 * 
 * <!-- end-model-doc -->
 * @see org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage#getIntervalQualifierType()
 * @model
 * @generated
 */
public enum IntervalQualifierType implements Enumerator {
	/**
	 * The '<em><b>YEAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR_VALUE
	 * @generated
	 * @ordered
	 */
	YEAR(0, "YEAR", "YEAR"),

	/**
	 * The '<em><b>MONTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONTH_VALUE
	 * @generated
	 * @ordered
	 */
	MONTH(1, "MONTH", "MONTH"),

	/**
	 * The '<em><b>DAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY_VALUE
	 * @generated
	 * @ordered
	 */
	DAY(2, "DAY", "DAY"),

	/**
	 * The '<em><b>HOUR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUR_VALUE
	 * @generated
	 * @ordered
	 */
	HOUR(3, "HOUR", "HOUR"),

	/**
	 * The '<em><b>MINUTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUTE_VALUE
	 * @generated
	 * @ordered
	 */
	MINUTE(4, "MINUTE", "MINUTE"),

	/**
	 * The '<em><b>SECOND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_VALUE
	 * @generated
	 * @ordered
	 */
	SECOND(5, "SECOND", "SECOND"),

	/**
	 * The '<em><b>FRACTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRACTION_VALUE
	 * @generated
	 * @ordered
	 */
	FRACTION(6, "FRACTION", "FRACTION");

	/**
	 * The '<em><b>YEAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>YEAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YEAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YEAR_VALUE = 0;

	/**
	 * The '<em><b>MONTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MONTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MONTH_VALUE = 1;

	/**
	 * The '<em><b>DAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAY_VALUE = 2;

	/**
	 * The '<em><b>HOUR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HOUR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOUR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOUR_VALUE = 3;

	/**
	 * The '<em><b>MINUTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MINUTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINUTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MINUTE_VALUE = 4;

	/**
	 * The '<em><b>SECOND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SECOND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECOND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECOND_VALUE = 5;

	/**
	 * The '<em><b>FRACTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FRACTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRACTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FRACTION_VALUE = 6;

	/**
	 * An array of all the '<em><b>Interval Qualifier Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IntervalQualifierType[] VALUES_ARRAY =
		new IntervalQualifierType[] {
			YEAR,
			MONTH,
			DAY,
			HOUR,
			MINUTE,
			SECOND,
			FRACTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Interval Qualifier Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IntervalQualifierType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Interval Qualifier Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntervalQualifierType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IntervalQualifierType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interval Qualifier Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntervalQualifierType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IntervalQualifierType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interval Qualifier Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntervalQualifierType get(int value) {
		switch (value) {
			case YEAR_VALUE: return YEAR;
			case MONTH_VALUE: return MONTH;
			case DAY_VALUE: return DAY;
			case HOUR_VALUE: return HOUR;
			case MINUTE_VALUE: return MINUTE;
			case SECOND_VALUE: return SECOND;
			case FRACTION_VALUE: return FRACTION;
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
	private IntervalQualifierType(int value, String name, String literal) {
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
	
	/*******************DEJAMOS ESTA SECCION POR COMPATIBILIDAD CON LOS PLUGINS QUE USAN EL DATATOOLS GENERADO CON COMPLIANCE 1.4 ***********************

	
	/**
	 * The '<em><b>YEAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>YEAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YEAR
	 * @generated NOT
	 * @ordered
	 */
	public static final IntervalQualifierType YEAR_LITERAL = YEAR; //$NON-NLS-1$
	
} //IntervalQualifierType
