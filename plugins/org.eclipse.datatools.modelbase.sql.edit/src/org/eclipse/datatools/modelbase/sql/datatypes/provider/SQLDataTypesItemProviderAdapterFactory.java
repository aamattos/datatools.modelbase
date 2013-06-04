/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.datatypes.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.datatools.modelbase.sql.datatypes.util.SQLDataTypesAdapterFactory;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SQLDataTypesItemProviderAdapterFactory extends SQLDataTypesAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLDataTypesItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.datatypes.CharacterStringDataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterStringDataTypeItemProvider characterStringDataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.datatypes.CharacterStringDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCharacterStringDataTypeAdapter() {
		if (characterStringDataTypeItemProvider == null) {
			characterStringDataTypeItemProvider = new CharacterStringDataTypeItemProvider(this);
		}

		return characterStringDataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.datatypes.RowDataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RowDataTypeItemProvider rowDataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.datatypes.RowDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRowDataTypeAdapter() {
		if (rowDataTypeItemProvider == null) {
			rowDataTypeItemProvider = new RowDataTypeItemProvider(this);
		}

		return rowDataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.datatypes.BooleanDataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanDataTypeItemProvider booleanDataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.datatypes.BooleanDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanDataTypeAdapter() {
		if (booleanDataTypeItemProvider == null) {
			booleanDataTypeItemProvider = new BooleanDataTypeItemProvider(this);
		}

		return booleanDataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.datatypes.IntervalDataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalDataTypeItemProvider intervalDataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.datatypes.IntervalDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntervalDataTypeAdapter() {
		if (intervalDataTypeItemProvider == null) {
			intervalDataTypeItemProvider = new IntervalDataTypeItemProvider(this);
		}

		return intervalDataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.datatypes.BinaryStringDataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryStringDataTypeItemProvider binaryStringDataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.datatypes.BinaryStringDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBinaryStringDataTypeAdapter() {
		if (binaryStringDataTypeItemProvider == null) {
			binaryStringDataTypeItemProvider = new BinaryStringDataTypeItemProvider(this);
		}

		return binaryStringDataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.datatypes.CharacterSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterSetItemProvider characterSetItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.datatypes.CharacterSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCharacterSetAdapter() {
		if (characterSetItemProvider == null) {
			characterSetItemProvider = new CharacterSetItemProvider(this);
		}

		return characterSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.datatypes.TimeDataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeDataTypeItemProvider timeDataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.datatypes.TimeDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeDataTypeAdapter() {
		if (timeDataTypeItemProvider == null) {
			timeDataTypeItemProvider = new TimeDataTypeItemProvider(this);
		}

		return timeDataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.datatypes.DistinctUserDefinedType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistinctUserDefinedTypeItemProvider distinctUserDefinedTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.datatypes.DistinctUserDefinedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDistinctUserDefinedTypeAdapter() {
		if (distinctUserDefinedTypeItemProvider == null) {
			distinctUserDefinedTypeItemProvider = new DistinctUserDefinedTypeItemProvider(this);
		}

		return distinctUserDefinedTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.datatypes.StructuredUserDefinedType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredUserDefinedTypeItemProvider structuredUserDefinedTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.datatypes.StructuredUserDefinedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructuredUserDefinedTypeAdapter() {
		if (structuredUserDefinedTypeItemProvider == null) {
			structuredUserDefinedTypeItemProvider = new StructuredUserDefinedTypeItemProvider(this);
		}

		return structuredUserDefinedTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.datatypes.AttributeDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDefinitionItemProvider attributeDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.datatypes.AttributeDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeDefinitionAdapter() {
		if (attributeDefinitionItemProvider == null) {
			attributeDefinitionItemProvider = new AttributeDefinitionItemProvider(this);
		}

		return attributeDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.datatypes.FixedPrecisionDataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedPrecisionDataTypeItemProvider fixedPrecisionDataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.datatypes.FixedPrecisionDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFixedPrecisionDataTypeAdapter() {
		if (fixedPrecisionDataTypeItemProvider == null) {
			fixedPrecisionDataTypeItemProvider = new FixedPrecisionDataTypeItemProvider(this);
		}

		return fixedPrecisionDataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.datatypes.Domain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainItemProvider domainItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.datatypes.Domain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainAdapter() {
		if (domainItemProvider == null) {
			domainItemProvider = new DomainItemProvider(this);
		}

		return domainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.datatypes.Field} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldItemProvider fieldItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.datatypes.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFieldAdapter() {
		if (fieldItemProvider == null) {
			fieldItemProvider = new FieldItemProvider(this);
		}

		return fieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.datatypes.DataLinkDataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataLinkDataTypeItemProvider dataLinkDataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.datatypes.DataLinkDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataLinkDataTypeAdapter() {
		if (dataLinkDataTypeItemProvider == null) {
			dataLinkDataTypeItemProvider = new DataLinkDataTypeItemProvider(this);
		}

		return dataLinkDataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.datatypes.UserDefinedTypeOrdering} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserDefinedTypeOrderingItemProvider userDefinedTypeOrderingItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.datatypes.UserDefinedTypeOrdering}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUserDefinedTypeOrderingAdapter() {
		if (userDefinedTypeOrderingItemProvider == null) {
			userDefinedTypeOrderingItemProvider = new UserDefinedTypeOrderingItemProvider(this);
		}

		return userDefinedTypeOrderingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.datatypes.DateDataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateDataTypeItemProvider dateDataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.datatypes.DateDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDateDataTypeAdapter() {
		if (dateDataTypeItemProvider == null) {
			dateDataTypeItemProvider = new DateDataTypeItemProvider(this);
		}

		return dateDataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.datatypes.ApproximateNumericDataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApproximateNumericDataTypeItemProvider approximateNumericDataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.datatypes.ApproximateNumericDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApproximateNumericDataTypeAdapter() {
		if (approximateNumericDataTypeItemProvider == null) {
			approximateNumericDataTypeItemProvider = new ApproximateNumericDataTypeItemProvider(this);
		}

		return approximateNumericDataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.datatypes.IntegerDataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerDataTypeItemProvider integerDataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.datatypes.IntegerDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerDataTypeAdapter() {
		if (integerDataTypeItemProvider == null) {
			integerDataTypeItemProvider = new IntegerDataTypeItemProvider(this);
		}

		return integerDataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.datatypes.XMLDataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLDataTypeItemProvider xmlDataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.datatypes.XMLDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXMLDataTypeAdapter() {
		if (xmlDataTypeItemProvider == null) {
			xmlDataTypeItemProvider = new XMLDataTypeItemProvider(this);
		}

		return xmlDataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.datatypes.ElementType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementTypeItemProvider elementTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.datatypes.ElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementTypeAdapter() {
		if (elementTypeItemProvider == null) {
			elementTypeItemProvider = new ElementTypeItemProvider(this);
		}

		return elementTypeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (characterStringDataTypeItemProvider != null) characterStringDataTypeItemProvider.dispose();
		if (rowDataTypeItemProvider != null) rowDataTypeItemProvider.dispose();
		if (booleanDataTypeItemProvider != null) booleanDataTypeItemProvider.dispose();
		if (intervalDataTypeItemProvider != null) intervalDataTypeItemProvider.dispose();
		if (binaryStringDataTypeItemProvider != null) binaryStringDataTypeItemProvider.dispose();
		if (characterSetItemProvider != null) characterSetItemProvider.dispose();
		if (timeDataTypeItemProvider != null) timeDataTypeItemProvider.dispose();
		if (distinctUserDefinedTypeItemProvider != null) distinctUserDefinedTypeItemProvider.dispose();
		if (structuredUserDefinedTypeItemProvider != null) structuredUserDefinedTypeItemProvider.dispose();
		if (attributeDefinitionItemProvider != null) attributeDefinitionItemProvider.dispose();
		if (fixedPrecisionDataTypeItemProvider != null) fixedPrecisionDataTypeItemProvider.dispose();
		if (domainItemProvider != null) domainItemProvider.dispose();
		if (fieldItemProvider != null) fieldItemProvider.dispose();
		if (dataLinkDataTypeItemProvider != null) dataLinkDataTypeItemProvider.dispose();
		if (userDefinedTypeOrderingItemProvider != null) userDefinedTypeOrderingItemProvider.dispose();
		if (dateDataTypeItemProvider != null) dateDataTypeItemProvider.dispose();
		if (approximateNumericDataTypeItemProvider != null) approximateNumericDataTypeItemProvider.dispose();
		if (integerDataTypeItemProvider != null) integerDataTypeItemProvider.dispose();
		if (xmlDataTypeItemProvider != null) xmlDataTypeItemProvider.dispose();
		if (elementTypeItemProvider != null) elementTypeItemProvider.dispose();
	}

}
