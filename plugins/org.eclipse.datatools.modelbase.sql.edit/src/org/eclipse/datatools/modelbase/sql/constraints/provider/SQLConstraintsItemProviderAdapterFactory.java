/**
 * <copyright>
 * </copyright>
 *
 * $Id: SQLConstraintsItemProviderAdapterFactory.java,v 1.1 2005/08/02 22:56:19 ledunnel Exp $
 */
package org.eclipse.datatools.modelbase.sql.constraints.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.datatools.modelbase.sql.constraints.util.SQLConstraintsAdapterFactory;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
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
public class SQLConstraintsItemProviderAdapterFactory extends SQLConstraintsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier {
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
	protected Collection supportedTypes = new ArrayList();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLConstraintsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);		
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.constraints.Assertion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertionItemProvider assertionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.constraints.Assertion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createAssertionAdapter() {
		if (assertionItemProvider == null) {
			assertionItemProvider = new AssertionItemProvider(this);
		}

		return assertionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.constraints.CheckConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckConstraintItemProvider checkConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.constraints.CheckConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createCheckConstraintAdapter() {
		if (checkConstraintItemProvider == null) {
			checkConstraintItemProvider = new CheckConstraintItemProvider(this);
		}

		return checkConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.constraints.ForeignKey} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyItemProvider foreignKeyItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.constraints.ForeignKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createForeignKeyAdapter() {
		if (foreignKeyItemProvider == null) {
			foreignKeyItemProvider = new ForeignKeyItemProvider(this);
		}

		return foreignKeyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.constraints.UniqueConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniqueConstraintItemProvider uniqueConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.constraints.UniqueConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createUniqueConstraintAdapter() {
		if (uniqueConstraintItemProvider == null) {
			uniqueConstraintItemProvider = new UniqueConstraintItemProvider(this);
		}

		return uniqueConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.constraints.PrimaryKey} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaryKeyItemProvider primaryKeyItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.constraints.PrimaryKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createPrimaryKeyAdapter() {
		if (primaryKeyItemProvider == null) {
			primaryKeyItemProvider = new PrimaryKeyItemProvider(this);
		}

		return primaryKeyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.constraints.Index} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexItemProvider indexItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.constraints.Index}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createIndexAdapter() {
		if (indexItemProvider == null) {
			indexItemProvider = new IndexItemProvider(this);
		}

		return indexItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.datatools.modelbase.sql.constraints.IndexMember} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexMemberItemProvider indexMemberItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.datatools.modelbase.sql.constraints.IndexMember}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createIndexMemberAdapter() {
		if (indexMemberItemProvider == null) {
			indexMemberItemProvider = new IndexMemberItemProvider(this);
		}

		return indexMemberItemProvider;
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
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class)type).isInstance(adapter))) {
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

}
