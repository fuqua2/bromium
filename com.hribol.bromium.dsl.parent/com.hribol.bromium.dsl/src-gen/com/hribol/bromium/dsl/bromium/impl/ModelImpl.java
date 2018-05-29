/**
 * generated by Xtext 2.13.0
 */
package com.hribol.bromium.dsl.bromium.impl;

import com.hribol.bromium.dsl.bromium.ApplicationAction;
import com.hribol.bromium.dsl.bromium.BromiumPackage;
import com.hribol.bromium.dsl.bromium.Model;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.hribol.bromium.dsl.bromium.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.hribol.bromium.dsl.bromium.impl.ModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link com.hribol.bromium.dsl.bromium.impl.ModelImpl#getBaseVersion <em>Base Version</em>}</li>
 *   <li>{@link com.hribol.bromium.dsl.bromium.impl.ModelImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;

  /**
   * The default value of the '{@link #getBaseVersion() <em>Base Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseVersion()
   * @generated
   * @ordered
   */
  protected static final String BASE_VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBaseVersion() <em>Base Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseVersion()
   * @generated
   * @ordered
   */
  protected String baseVersion = BASE_VERSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<ApplicationAction> actions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BromiumPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BromiumPackage.MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BromiumPackage.MODEL__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBaseVersion()
  {
    return baseVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBaseVersion(String newBaseVersion)
  {
    String oldBaseVersion = baseVersion;
    baseVersion = newBaseVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BromiumPackage.MODEL__BASE_VERSION, oldBaseVersion, baseVersion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ApplicationAction> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<ApplicationAction>(ApplicationAction.class, this, BromiumPackage.MODEL__ACTIONS);
    }
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BromiumPackage.MODEL__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BromiumPackage.MODEL__NAME:
        return getName();
      case BromiumPackage.MODEL__VERSION:
        return getVersion();
      case BromiumPackage.MODEL__BASE_VERSION:
        return getBaseVersion();
      case BromiumPackage.MODEL__ACTIONS:
        return getActions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BromiumPackage.MODEL__NAME:
        setName((String)newValue);
        return;
      case BromiumPackage.MODEL__VERSION:
        setVersion((String)newValue);
        return;
      case BromiumPackage.MODEL__BASE_VERSION:
        setBaseVersion((String)newValue);
        return;
      case BromiumPackage.MODEL__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends ApplicationAction>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BromiumPackage.MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BromiumPackage.MODEL__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case BromiumPackage.MODEL__BASE_VERSION:
        setBaseVersion(BASE_VERSION_EDEFAULT);
        return;
      case BromiumPackage.MODEL__ACTIONS:
        getActions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BromiumPackage.MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BromiumPackage.MODEL__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case BromiumPackage.MODEL__BASE_VERSION:
        return BASE_VERSION_EDEFAULT == null ? baseVersion != null : !BASE_VERSION_EDEFAULT.equals(baseVersion);
      case BromiumPackage.MODEL__ACTIONS:
        return actions != null && !actions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", version: ");
    result.append(version);
    result.append(", baseVersion: ");
    result.append(baseVersion);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
