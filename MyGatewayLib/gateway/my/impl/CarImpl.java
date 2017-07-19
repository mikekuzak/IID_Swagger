/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gateway.my.impl;

import gateway.my.Car;
import gateway.my.MyPackage;
import gateway.my.Specs;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.sdo.impl.EDataObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gateway.my.impl.CarImpl#getId <em>Id</em>}</li>
 *   <li>{@link gateway.my.impl.CarImpl#getName <em>Name</em>}</li>
 *   <li>{@link gateway.my.impl.CarImpl#getModel <em>Model</em>}</li>
 *   <li>{@link gateway.my.impl.CarImpl#getYear <em>Year</em>}</li>
 *   <li>{@link gateway.my.impl.CarImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link gateway.my.impl.CarImpl#getSpec <em>Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CarImpl extends EDataObjectImpl implements Car
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

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
   * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModel()
   * @generated
   * @ordered
   */
  protected static final String MODEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModel()
   * @generated
   * @ordered
   */
  protected String model = MODEL_EDEFAULT;

  /**
   * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYear()
   * @generated
   * @ordered
   */
  protected static final String YEAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYear()
   * @generated
   * @ordered
   */
  protected String year = YEAR_EDEFAULT;

  /**
   * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrice()
   * @generated
   * @ordered
   */
  protected static final int PRICE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrice()
   * @generated
   * @ordered
   */
  protected int price = PRICE_EDEFAULT;

  /**
   * This is true if the Price attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean priceESet;

  /**
   * The cached value of the '{@link #getSpec() <em>Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpec()
   * @generated
   * @ordered
   */
  protected Specs spec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CarImpl()
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
    return MyPackage.Literals.CAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyPackage.CAR__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyPackage.CAR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModel()
  {
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModel(String newModel)
  {
    String oldModel = model;
    model = newModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyPackage.CAR__MODEL, oldModel, model));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getYear()
  {
    return year;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYear(String newYear)
  {
    String oldYear = year;
    year = newYear;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyPackage.CAR__YEAR, oldYear, year));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPrice()
  {
    return price;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrice(int newPrice)
  {
    int oldPrice = price;
    price = newPrice;
    boolean oldPriceESet = priceESet;
    priceESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyPackage.CAR__PRICE, oldPrice, price, !oldPriceESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetPrice()
  {
    int oldPrice = price;
    boolean oldPriceESet = priceESet;
    price = PRICE_EDEFAULT;
    priceESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MyPackage.CAR__PRICE, oldPrice, PRICE_EDEFAULT, oldPriceESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetPrice()
  {
    return priceESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Specs getSpec()
  {
    return spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpec(Specs newSpec, NotificationChain msgs)
  {
    Specs oldSpec = spec;
    spec = newSpec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyPackage.CAR__SPEC, oldSpec, newSpec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpec(Specs newSpec)
  {
    if (newSpec != spec)
    {
      NotificationChain msgs = null;
      if (spec != null)
        msgs = ((InternalEObject)spec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyPackage.CAR__SPEC, null, msgs);
      if (newSpec != null)
        msgs = ((InternalEObject)newSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyPackage.CAR__SPEC, null, msgs);
      msgs = basicSetSpec(newSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyPackage.CAR__SPEC, newSpec, newSpec));
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
      case MyPackage.CAR__SPEC:
        return basicSetSpec(null, msgs);
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
      case MyPackage.CAR__ID:
        return getId();
      case MyPackage.CAR__NAME:
        return getName();
      case MyPackage.CAR__MODEL:
        return getModel();
      case MyPackage.CAR__YEAR:
        return getYear();
      case MyPackage.CAR__PRICE:
        return getPrice();
      case MyPackage.CAR__SPEC:
        return getSpec();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyPackage.CAR__ID:
        setId((String)newValue);
        return;
      case MyPackage.CAR__NAME:
        setName((String)newValue);
        return;
      case MyPackage.CAR__MODEL:
        setModel((String)newValue);
        return;
      case MyPackage.CAR__YEAR:
        setYear((String)newValue);
        return;
      case MyPackage.CAR__PRICE:
        setPrice((Integer)newValue);
        return;
      case MyPackage.CAR__SPEC:
        setSpec((Specs)newValue);
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
      case MyPackage.CAR__ID:
        setId(ID_EDEFAULT);
        return;
      case MyPackage.CAR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyPackage.CAR__MODEL:
        setModel(MODEL_EDEFAULT);
        return;
      case MyPackage.CAR__YEAR:
        setYear(YEAR_EDEFAULT);
        return;
      case MyPackage.CAR__PRICE:
        unsetPrice();
        return;
      case MyPackage.CAR__SPEC:
        setSpec((Specs)null);
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
      case MyPackage.CAR__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case MyPackage.CAR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyPackage.CAR__MODEL:
        return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
      case MyPackage.CAR__YEAR:
        return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
      case MyPackage.CAR__PRICE:
        return isSetPrice();
      case MyPackage.CAR__SPEC:
        return spec != null;
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
    result.append(" (id: ");
    result.append(id);
    result.append(", name: ");
    result.append(name);
    result.append(", model: ");
    result.append(model);
    result.append(", year: ");
    result.append(year);
    result.append(", price: ");
    if (priceESet) result.append(price); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //CarImpl
