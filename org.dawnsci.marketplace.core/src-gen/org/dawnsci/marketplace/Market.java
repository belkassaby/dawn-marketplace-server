/**
 */
package org.dawnsci.marketplace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Market</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dawnsci.marketplace.Market#getName <em>Name</em>}</li>
 *   <li>{@link org.dawnsci.marketplace.Market#getId <em>Id</em>}</li>
 *   <li>{@link org.dawnsci.marketplace.Market#getUrl <em>Url</em>}</li>
 *   <li>{@link org.dawnsci.marketplace.Market#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see org.dawnsci.marketplace.MarketplacePackage#getMarket()
 * @model extendedMetaData="name='market'"
 * @generated
 */
public interface Market extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.dawnsci.marketplace.MarketplacePackage#getMarket_Name()
	 * @model annotation="teneo.jpa value='@Lob'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dawnsci.marketplace.Market#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Long)
	 * @see org.dawnsci.marketplace.MarketplacePackage#getMarket_Id()
	 * @model id="true"
	 *        annotation="teneo.jpa value='@Id\n@GeneratedValue(strategy=GenerationType.IDENTITY)'"
	 * @generated
	 */
	Long getId();

	/**
	 * Sets the value of the '{@link org.dawnsci.marketplace.Market#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Long value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.dawnsci.marketplace.MarketplacePackage#getMarket_Url()
	 * @model annotation="teneo.jpa value='@Lob'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.dawnsci.marketplace.Market#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.dawnsci.marketplace.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.dawnsci.marketplace.MarketplacePackage#getMarket_Category()
	 * @model containment="true" required="true"
	 *        extendedMetaData="name='category'"
	 * @generated
	 */
	EList<Category> getCategory();

} // Market
