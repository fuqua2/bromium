/**
 * generated by Xtext 2.13.0
 */
package com.hribol.bromium.dsl.bromium.impl;

import com.hribol.bromium.dsl.bromium.ApplicationAction;
import com.hribol.bromium.dsl.bromium.BromiumPackage;
import com.hribol.bromium.dsl.bromium.ExpectHttpRequest;
import com.hribol.bromium.dsl.bromium.Postcondition;
import com.hribol.bromium.dsl.bromium.Precondition;
import com.hribol.bromium.dsl.bromium.SyntaxDefinition;
import com.hribol.bromium.dsl.bromium.WebDriverAction;

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
 * An implementation of the model object '<em><b>Application Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.hribol.bromium.dsl.bromium.impl.ApplicationActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.hribol.bromium.dsl.bromium.impl.ApplicationActionImpl#getSyntaxDefinitions <em>Syntax Definitions</em>}</li>
 *   <li>{@link com.hribol.bromium.dsl.bromium.impl.ApplicationActionImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link com.hribol.bromium.dsl.bromium.impl.ApplicationActionImpl#getWebDriverAction <em>Web Driver Action</em>}</li>
 *   <li>{@link com.hribol.bromium.dsl.bromium.impl.ApplicationActionImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link com.hribol.bromium.dsl.bromium.impl.ApplicationActionImpl#getExpectHttpRequest <em>Expect Http Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationActionImpl extends MinimalEObjectImpl.Container implements ApplicationAction
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
   * The cached value of the '{@link #getSyntaxDefinitions() <em>Syntax Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSyntaxDefinitions()
   * @generated
   * @ordered
   */
  protected EList<SyntaxDefinition> syntaxDefinitions;

  /**
   * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrecondition()
   * @generated
   * @ordered
   */
  protected Precondition precondition;

  /**
   * The cached value of the '{@link #getWebDriverAction() <em>Web Driver Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWebDriverAction()
   * @generated
   * @ordered
   */
  protected WebDriverAction webDriverAction;

  /**
   * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostcondition()
   * @generated
   * @ordered
   */
  protected Postcondition postcondition;

  /**
   * The cached value of the '{@link #getExpectHttpRequest() <em>Expect Http Request</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpectHttpRequest()
   * @generated
   * @ordered
   */
  protected ExpectHttpRequest expectHttpRequest;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationActionImpl()
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
    return BromiumPackage.Literals.APPLICATION_ACTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, BromiumPackage.APPLICATION_ACTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SyntaxDefinition> getSyntaxDefinitions()
  {
    if (syntaxDefinitions == null)
    {
      syntaxDefinitions = new EObjectContainmentEList<SyntaxDefinition>(SyntaxDefinition.class, this, BromiumPackage.APPLICATION_ACTION__SYNTAX_DEFINITIONS);
    }
    return syntaxDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Precondition getPrecondition()
  {
    return precondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrecondition(Precondition newPrecondition, NotificationChain msgs)
  {
    Precondition oldPrecondition = precondition;
    precondition = newPrecondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BromiumPackage.APPLICATION_ACTION__PRECONDITION, oldPrecondition, newPrecondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrecondition(Precondition newPrecondition)
  {
    if (newPrecondition != precondition)
    {
      NotificationChain msgs = null;
      if (precondition != null)
        msgs = ((InternalEObject)precondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BromiumPackage.APPLICATION_ACTION__PRECONDITION, null, msgs);
      if (newPrecondition != null)
        msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BromiumPackage.APPLICATION_ACTION__PRECONDITION, null, msgs);
      msgs = basicSetPrecondition(newPrecondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BromiumPackage.APPLICATION_ACTION__PRECONDITION, newPrecondition, newPrecondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebDriverAction getWebDriverAction()
  {
    return webDriverAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWebDriverAction(WebDriverAction newWebDriverAction, NotificationChain msgs)
  {
    WebDriverAction oldWebDriverAction = webDriverAction;
    webDriverAction = newWebDriverAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BromiumPackage.APPLICATION_ACTION__WEB_DRIVER_ACTION, oldWebDriverAction, newWebDriverAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWebDriverAction(WebDriverAction newWebDriverAction)
  {
    if (newWebDriverAction != webDriverAction)
    {
      NotificationChain msgs = null;
      if (webDriverAction != null)
        msgs = ((InternalEObject)webDriverAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BromiumPackage.APPLICATION_ACTION__WEB_DRIVER_ACTION, null, msgs);
      if (newWebDriverAction != null)
        msgs = ((InternalEObject)newWebDriverAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BromiumPackage.APPLICATION_ACTION__WEB_DRIVER_ACTION, null, msgs);
      msgs = basicSetWebDriverAction(newWebDriverAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BromiumPackage.APPLICATION_ACTION__WEB_DRIVER_ACTION, newWebDriverAction, newWebDriverAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Postcondition getPostcondition()
  {
    return postcondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPostcondition(Postcondition newPostcondition, NotificationChain msgs)
  {
    Postcondition oldPostcondition = postcondition;
    postcondition = newPostcondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BromiumPackage.APPLICATION_ACTION__POSTCONDITION, oldPostcondition, newPostcondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPostcondition(Postcondition newPostcondition)
  {
    if (newPostcondition != postcondition)
    {
      NotificationChain msgs = null;
      if (postcondition != null)
        msgs = ((InternalEObject)postcondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BromiumPackage.APPLICATION_ACTION__POSTCONDITION, null, msgs);
      if (newPostcondition != null)
        msgs = ((InternalEObject)newPostcondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BromiumPackage.APPLICATION_ACTION__POSTCONDITION, null, msgs);
      msgs = basicSetPostcondition(newPostcondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BromiumPackage.APPLICATION_ACTION__POSTCONDITION, newPostcondition, newPostcondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpectHttpRequest getExpectHttpRequest()
  {
    return expectHttpRequest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpectHttpRequest(ExpectHttpRequest newExpectHttpRequest, NotificationChain msgs)
  {
    ExpectHttpRequest oldExpectHttpRequest = expectHttpRequest;
    expectHttpRequest = newExpectHttpRequest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BromiumPackage.APPLICATION_ACTION__EXPECT_HTTP_REQUEST, oldExpectHttpRequest, newExpectHttpRequest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpectHttpRequest(ExpectHttpRequest newExpectHttpRequest)
  {
    if (newExpectHttpRequest != expectHttpRequest)
    {
      NotificationChain msgs = null;
      if (expectHttpRequest != null)
        msgs = ((InternalEObject)expectHttpRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BromiumPackage.APPLICATION_ACTION__EXPECT_HTTP_REQUEST, null, msgs);
      if (newExpectHttpRequest != null)
        msgs = ((InternalEObject)newExpectHttpRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BromiumPackage.APPLICATION_ACTION__EXPECT_HTTP_REQUEST, null, msgs);
      msgs = basicSetExpectHttpRequest(newExpectHttpRequest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BromiumPackage.APPLICATION_ACTION__EXPECT_HTTP_REQUEST, newExpectHttpRequest, newExpectHttpRequest));
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
      case BromiumPackage.APPLICATION_ACTION__SYNTAX_DEFINITIONS:
        return ((InternalEList<?>)getSyntaxDefinitions()).basicRemove(otherEnd, msgs);
      case BromiumPackage.APPLICATION_ACTION__PRECONDITION:
        return basicSetPrecondition(null, msgs);
      case BromiumPackage.APPLICATION_ACTION__WEB_DRIVER_ACTION:
        return basicSetWebDriverAction(null, msgs);
      case BromiumPackage.APPLICATION_ACTION__POSTCONDITION:
        return basicSetPostcondition(null, msgs);
      case BromiumPackage.APPLICATION_ACTION__EXPECT_HTTP_REQUEST:
        return basicSetExpectHttpRequest(null, msgs);
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
      case BromiumPackage.APPLICATION_ACTION__NAME:
        return getName();
      case BromiumPackage.APPLICATION_ACTION__SYNTAX_DEFINITIONS:
        return getSyntaxDefinitions();
      case BromiumPackage.APPLICATION_ACTION__PRECONDITION:
        return getPrecondition();
      case BromiumPackage.APPLICATION_ACTION__WEB_DRIVER_ACTION:
        return getWebDriverAction();
      case BromiumPackage.APPLICATION_ACTION__POSTCONDITION:
        return getPostcondition();
      case BromiumPackage.APPLICATION_ACTION__EXPECT_HTTP_REQUEST:
        return getExpectHttpRequest();
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
      case BromiumPackage.APPLICATION_ACTION__NAME:
        setName((String)newValue);
        return;
      case BromiumPackage.APPLICATION_ACTION__SYNTAX_DEFINITIONS:
        getSyntaxDefinitions().clear();
        getSyntaxDefinitions().addAll((Collection<? extends SyntaxDefinition>)newValue);
        return;
      case BromiumPackage.APPLICATION_ACTION__PRECONDITION:
        setPrecondition((Precondition)newValue);
        return;
      case BromiumPackage.APPLICATION_ACTION__WEB_DRIVER_ACTION:
        setWebDriverAction((WebDriverAction)newValue);
        return;
      case BromiumPackage.APPLICATION_ACTION__POSTCONDITION:
        setPostcondition((Postcondition)newValue);
        return;
      case BromiumPackage.APPLICATION_ACTION__EXPECT_HTTP_REQUEST:
        setExpectHttpRequest((ExpectHttpRequest)newValue);
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
      case BromiumPackage.APPLICATION_ACTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BromiumPackage.APPLICATION_ACTION__SYNTAX_DEFINITIONS:
        getSyntaxDefinitions().clear();
        return;
      case BromiumPackage.APPLICATION_ACTION__PRECONDITION:
        setPrecondition((Precondition)null);
        return;
      case BromiumPackage.APPLICATION_ACTION__WEB_DRIVER_ACTION:
        setWebDriverAction((WebDriverAction)null);
        return;
      case BromiumPackage.APPLICATION_ACTION__POSTCONDITION:
        setPostcondition((Postcondition)null);
        return;
      case BromiumPackage.APPLICATION_ACTION__EXPECT_HTTP_REQUEST:
        setExpectHttpRequest((ExpectHttpRequest)null);
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
      case BromiumPackage.APPLICATION_ACTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BromiumPackage.APPLICATION_ACTION__SYNTAX_DEFINITIONS:
        return syntaxDefinitions != null && !syntaxDefinitions.isEmpty();
      case BromiumPackage.APPLICATION_ACTION__PRECONDITION:
        return precondition != null;
      case BromiumPackage.APPLICATION_ACTION__WEB_DRIVER_ACTION:
        return webDriverAction != null;
      case BromiumPackage.APPLICATION_ACTION__POSTCONDITION:
        return postcondition != null;
      case BromiumPackage.APPLICATION_ACTION__EXPECT_HTTP_REQUEST:
        return expectHttpRequest != null;
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
    result.append(')');
    return result.toString();
  }

} //ApplicationActionImpl
