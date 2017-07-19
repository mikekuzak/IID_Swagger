/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gateway.my.impl;

import gateway.my.MyPackage;
import gateway.my.Specs;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.sdo.impl.EDataObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gateway.my.impl.SpecsImpl#getId <em>Id</em>}</li>
 *   <li>{@link gateway.my.impl.SpecsImpl#getColor <em>Color</em>}</li>
 *   <li>{@link gateway.my.impl.SpecsImpl#getMph <em>Mph</em>}</li>
 *   <li>{@link gateway.my.impl.SpecsImpl#getPs <em>Ps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecsImpl extends EDataObjectImpl implements Specs
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
  protected static final int ID_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected int id = ID_EDEFAULT;

  /**
   * This is true if the Id attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean idESet;

  /**
   * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected static final String COLOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected String color = COLOR_EDEFAULT;

  /**
   * The default value of the '{@link #getMph() <em>Mph</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMph()
   * @generated
   * @ordered
   */
  protected static final int MPH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMph() <em>Mph</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMph()
   * @generated
   * @ordered
   */
  protected int mph = MPH_EDEFAULT;

  /**
   * This is true if the Mph attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean mphESet;

  /**
   * The default value of the '{@link #getPs() <em>Ps</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPs()
   * @generated
   * @ordered
   */
  protected static final int PS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPs() <em>Ps</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPs()
   * @generated
   * @ordered
   */
  protected int ps = PS_EDEFAULT;

  /**
   * This is true if the Ps attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean psESet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpecsImpl()
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
    return MyPackage.Literals.SPECS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(int newId)
  {
    int oldId = id;
    id = newId;
    boolean oldIdESet = idESet;
    idESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyPackage.SPECS__ID, oldId, id, !oldIdESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetId()
  {
    int oldId = id;
    boolean oldIdESet = idESet;
    id = ID_EDEFAULT;
    idESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MyPackage.SPECS__ID, oldId, ID_EDEFAULT, oldIdESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetId()
  {
    return idESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(String newColor)
  {
    String oldColor = color;
    color = newColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyPackage.SPECS__COLOR, oldColor, color));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMph()
  {
    return mph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMph(int newMph)
  {
    int oldMph = mph;
    mph = newMph;
    boolean oldMphESet = mphESet;
    mphESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyPackage.SPECS__MPH, oldMph, mph, !oldMphESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetMph()
  {
    int oldMph = mph;
    boolean oldMphESet = mphESet;
    mph = MPH_EDEFAULT;
    mphESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MyPackage.SPECS__MPH, oldMph, MPH_EDEFAULT, oldMphESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetMph()
  {
    return mphESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPs()
  {
    return ps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPs(int newPs)
  {
    int oldPs = ps;
    ps = newPs;
    boolean oldPsESet = psESet;
    psESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyPackage.SPECS__PS, oldPs, ps, !oldPsESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetPs()
  {
    int oldPs = ps;
    boolean oldPsESet = psESet;
    ps = PS_EDEFAULT;
    psESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MyPackage.SPECS__PS, oldPs, PS_EDEFAULT, oldPsESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetPs()
  {
    return psESet;
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
      case MyPackage.SPECS__ID:
        return getId();
      case MyPackage.SPECS__COLOR:
        return getColor();
      case MyPackage.SPECS__MPH:
        return getMph();
      case MyPackage.SPECS__PS:
        return getPs();
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
      case MyPackage.SPECS__ID:
        setId((Integer)newValue);
        return;
      case MyPackage.SPECS__COLOR:
        setColor((String)newValue);
        return;
      case MyPackage.SPECS__MPH:
        setMph((Integer)newValue);
        return;
      case MyPackage.SPECS__PS:
        setPs((Integer)newValue);
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
      case MyPackage.SPECS__ID:
        unsetId();
        return;
      case MyPackage.SPECS__COLOR:
        setColor(COLOR_EDEFAULT);
        return;
      case MyPackage.SPECS__MPH:
        unsetMph();
        return;
      case MyPackage.SPECS__PS:
        unsetPs();
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
      case MyPackage.SPECS__ID:
        return isSetId();
      case MyPackage.SPECS__COLOR:
        return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
      case MyPackage.SPECS__MPH:
        return isSetMph();
      case MyPackage.SPECS__PS:
        return isSetPs();
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
    if (idESet) result.append(id); else result.append("<unset>");
    result.append(", color: ");
    result.append(color);
    result.append(", mph: ");
    if (mphESet) result.append(mph); else result.append("<unset>");
    result.append(", ps: ");
    if (psESet) result.append(ps); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //SpecsImpl
