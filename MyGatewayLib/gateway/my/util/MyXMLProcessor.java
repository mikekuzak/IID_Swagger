/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gateway.my.util;

import gateway.my.MyPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MyXMLProcessor extends XMLProcessor
{

  /**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyXMLProcessor()
  {
    super((EPackage.Registry.INSTANCE));
    MyPackage.eINSTANCE.eClass();
  }
  
  /**
   * Register for "*" and "xml" file extensions the MyResourceFactoryImpl factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Map<String, Resource.Factory> getRegistrations()
  {
    if (registrations == null)
    {
      super.getRegistrations();
      registrations.put(XML_EXTENSION, new MyResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new MyResourceFactoryImpl());
    }
    return registrations;
  }

} //MyXMLProcessor
