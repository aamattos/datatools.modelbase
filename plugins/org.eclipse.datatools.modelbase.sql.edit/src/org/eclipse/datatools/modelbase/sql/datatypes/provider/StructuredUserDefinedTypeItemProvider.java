/**
 * <copyright>
 * </copyright>
 *
 * $Id: StructuredUserDefinedTypeItemProvider.java,v 1.1 2005/08/02 22:56:25 ledunnel Exp $
 */
package org.eclipse.datatools.modelbase.sql.datatypes.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesFactory;
import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage;
import org.eclipse.datatools.modelbase.sql.datatypes.StructuredUserDefinedType;
import org.eclipse.datatools.modelbase.sql.routines.SQLRoutinesFactory;
import org.eclipse.datatools.modelbase.sql.schema.provider.SqlmodelEditPlugin;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;


/**
 * This is the item provider adapter for a {@link org.eclipse.datatools.modelbase.sql.datatypes.StructuredUserDefinedType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuredUserDefinedTypeItemProvider
	extends UserDefinedTypeItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredUserDefinedTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInstantiablePropertyDescriptor(object);
			addFinalPropertyDescriptor(object);
			addSuperPropertyDescriptor(object);
			addSubPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Instantiable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstantiablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StructuredUserDefinedType_instantiable_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_StructuredUserDefinedType_instantiable_feature", "_UI_StructuredUserDefinedType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SQLDataTypesPackage.eINSTANCE.getStructuredUserDefinedType_Instantiable(),
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Final feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StructuredUserDefinedType_final_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_StructuredUserDefinedType_final_feature", "_UI_StructuredUserDefinedType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SQLDataTypesPackage.eINSTANCE.getStructuredUserDefinedType_Final(),
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Super feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StructuredUserDefinedType_super_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_StructuredUserDefinedType_super_feature", "_UI_StructuredUserDefinedType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SQLDataTypesPackage.eINSTANCE.getStructuredUserDefinedType_Super(),
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StructuredUserDefinedType_sub_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_StructuredUserDefinedType_sub_feature", "_UI_StructuredUserDefinedType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SQLDataTypesPackage.eINSTANCE.getStructuredUserDefinedType_Sub(),
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SQLDataTypesPackage.eINSTANCE.getStructuredUserDefinedType_Attributes());
			childrenFeatures.add(SQLDataTypesPackage.eINSTANCE.getStructuredUserDefinedType_Methods());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns StructuredUserDefinedType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/StructuredUserDefinedType"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((StructuredUserDefinedType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_StructuredUserDefinedType_type") : //$NON-NLS-1$
			getString("_UI_StructuredUserDefinedType_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(StructuredUserDefinedType.class)) {
			case SQLDataTypesPackage.STRUCTURED_USER_DEFINED_TYPE__INSTANTIABLE:
			case SQLDataTypesPackage.STRUCTURED_USER_DEFINED_TYPE__FINAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SQLDataTypesPackage.STRUCTURED_USER_DEFINED_TYPE__ATTRIBUTES:
			case SQLDataTypesPackage.STRUCTURED_USER_DEFINED_TYPE__METHODS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing all of the children that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SQLDataTypesPackage.eINSTANCE.getStructuredUserDefinedType_Attributes(),
				 SQLDataTypesFactory.eINSTANCE.createAttributeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SQLDataTypesPackage.eINSTANCE.getStructuredUserDefinedType_Methods(),
				 SQLRoutinesFactory.eINSTANCE.createMethod()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return SqlmodelEditPlugin.INSTANCE;
	}

}
