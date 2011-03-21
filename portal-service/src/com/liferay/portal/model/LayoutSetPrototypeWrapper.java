/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.model;

/**
 * <p>
 * This class is a wrapper for {@link LayoutSetPrototype}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       LayoutSetPrototype
 * @generated
 */
public class LayoutSetPrototypeWrapper implements LayoutSetPrototype {
	public LayoutSetPrototypeWrapper(LayoutSetPrototype layoutSetPrototype) {
		_layoutSetPrototype = layoutSetPrototype;
	}

	public Class<?> getModelClass() {
		return LayoutSetPrototype.class;
	}

	public String getModelClassName() {
		return LayoutSetPrototype.class.getName();
	}

	/**
	* Gets the primary key of this layout set prototype.
	*
	* @return the primary key of this layout set prototype
	*/
	public long getPrimaryKey() {
		return _layoutSetPrototype.getPrimaryKey();
	}

	/**
	* Sets the primary key of this layout set prototype
	*
	* @param pk the primary key of this layout set prototype
	*/
	public void setPrimaryKey(long pk) {
		_layoutSetPrototype.setPrimaryKey(pk);
	}

	/**
	* Gets the uuid of this layout set prototype.
	*
	* @return the uuid of this layout set prototype
	*/
	public java.lang.String getUuid() {
		return _layoutSetPrototype.getUuid();
	}

	/**
	* Sets the uuid of this layout set prototype.
	*
	* @param uuid the uuid of this layout set prototype
	*/
	public void setUuid(java.lang.String uuid) {
		_layoutSetPrototype.setUuid(uuid);
	}

	/**
	* Gets the layout set prototype ID of this layout set prototype.
	*
	* @return the layout set prototype ID of this layout set prototype
	*/
	public long getLayoutSetPrototypeId() {
		return _layoutSetPrototype.getLayoutSetPrototypeId();
	}

	/**
	* Sets the layout set prototype ID of this layout set prototype.
	*
	* @param layoutSetPrototypeId the layout set prototype ID of this layout set prototype
	*/
	public void setLayoutSetPrototypeId(long layoutSetPrototypeId) {
		_layoutSetPrototype.setLayoutSetPrototypeId(layoutSetPrototypeId);
	}

	/**
	* Gets the company ID of this layout set prototype.
	*
	* @return the company ID of this layout set prototype
	*/
	public long getCompanyId() {
		return _layoutSetPrototype.getCompanyId();
	}

	/**
	* Sets the company ID of this layout set prototype.
	*
	* @param companyId the company ID of this layout set prototype
	*/
	public void setCompanyId(long companyId) {
		_layoutSetPrototype.setCompanyId(companyId);
	}

	/**
	* Gets the name of this layout set prototype.
	*
	* @return the name of this layout set prototype
	*/
	public java.lang.String getName() {
		return _layoutSetPrototype.getName();
	}

	/**
	* Gets the localized name of this layout set prototype. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale to get the localized name for
	* @return the localized name of this layout set prototype
	*/
	public java.lang.String getName(java.util.Locale locale) {
		return _layoutSetPrototype.getName(locale);
	}

	/**
	* Gets the localized name of this layout set prototype, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local to get the localized name for
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized name of this layout set prototype. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	public java.lang.String getName(java.util.Locale locale, boolean useDefault) {
		return _layoutSetPrototype.getName(locale, useDefault);
	}

	/**
	* Gets the localized name of this layout set prototype. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the id of the language to get the localized name for
	* @return the localized name of this layout set prototype
	*/
	public java.lang.String getName(java.lang.String languageId) {
		return _layoutSetPrototype.getName(languageId);
	}

	/**
	* Gets the localized name of this layout set prototype, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the id of the language to get the localized name for
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized name of this layout set prototype
	*/
	public java.lang.String getName(java.lang.String languageId,
		boolean useDefault) {
		return _layoutSetPrototype.getName(languageId, useDefault);
	}

	/**
	* Gets a map of the locales and localized name of this layout set prototype.
	*
	* @return the locales and localized name
	*/
	public java.util.Map<java.util.Locale, java.lang.String> getNameMap() {
		return _layoutSetPrototype.getNameMap();
	}

	/**
	* Sets the name of this layout set prototype.
	*
	* @param name the name of this layout set prototype
	*/
	public void setName(java.lang.String name) {
		_layoutSetPrototype.setName(name);
	}

	/**
	* Sets the localized name of this layout set prototype.
	*
	* @param name the localized name of this layout set prototype
	* @param locale the locale to set the localized name for
	*/
	public void setName(java.lang.String name, java.util.Locale locale) {
		_layoutSetPrototype.setName(name, locale);
	}

	public void setName(java.lang.String name, java.util.Locale locale,
		java.util.Locale defaultLocale) {
		_layoutSetPrototype.setName(name, locale, defaultLocale);
	}

	/**
	* Sets the localized names of this layout set prototype from the map of locales and localized names.
	*
	* @param nameMap the locales and localized names of this layout set prototype
	*/
	public void setNameMap(
		java.util.Map<java.util.Locale, java.lang.String> nameMap) {
		_layoutSetPrototype.setNameMap(nameMap);
	}

	public void setNameMap(
		java.util.Map<java.util.Locale, java.lang.String> nameMap,
		java.util.Locale defaultLocale) {
		_layoutSetPrototype.setNameMap(nameMap, defaultLocale);
	}

	/**
	* Gets the description of this layout set prototype.
	*
	* @return the description of this layout set prototype
	*/
	public java.lang.String getDescription() {
		return _layoutSetPrototype.getDescription();
	}

	/**
	* Sets the description of this layout set prototype.
	*
	* @param description the description of this layout set prototype
	*/
	public void setDescription(java.lang.String description) {
		_layoutSetPrototype.setDescription(description);
	}

	/**
	* Gets the settings of this layout set prototype.
	*
	* @return the settings of this layout set prototype
	*/
	public java.lang.String getSettings() {
		return _layoutSetPrototype.getSettings();
	}

	/**
	* Sets the settings of this layout set prototype.
	*
	* @param settings the settings of this layout set prototype
	*/
	public void setSettings(java.lang.String settings) {
		_layoutSetPrototype.setSettings(settings);
	}

	/**
	* Gets the active of this layout set prototype.
	*
	* @return the active of this layout set prototype
	*/
	public boolean getActive() {
		return _layoutSetPrototype.getActive();
	}

	/**
	* Determines if this layout set prototype is active.
	*
	* @return <code>true</code> if this layout set prototype is active; <code>false</code> otherwise
	*/
	public boolean isActive() {
		return _layoutSetPrototype.isActive();
	}

	/**
	* Sets whether this layout set prototype is active.
	*
	* @param active the active of this layout set prototype
	*/
	public void setActive(boolean active) {
		_layoutSetPrototype.setActive(active);
	}

	public boolean isNew() {
		return _layoutSetPrototype.isNew();
	}

	public void setNew(boolean n) {
		_layoutSetPrototype.setNew(n);
	}

	public boolean isCachedModel() {
		return _layoutSetPrototype.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_layoutSetPrototype.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _layoutSetPrototype.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_layoutSetPrototype.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _layoutSetPrototype.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _layoutSetPrototype.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_layoutSetPrototype.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return new LayoutSetPrototypeWrapper((LayoutSetPrototype)_layoutSetPrototype.clone());
	}

	public int compareTo(
		com.liferay.portal.model.LayoutSetPrototype layoutSetPrototype) {
		return _layoutSetPrototype.compareTo(layoutSetPrototype);
	}

	public int hashCode() {
		return _layoutSetPrototype.hashCode();
	}

	public com.liferay.portal.model.LayoutSetPrototype toEscapedModel() {
		return new LayoutSetPrototypeWrapper(_layoutSetPrototype.toEscapedModel());
	}

	public java.lang.String toString() {
		return _layoutSetPrototype.toString();
	}

	public java.lang.String toXmlString() {
		return _layoutSetPrototype.toXmlString();
	}

	public com.liferay.portal.model.Group getGroup()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _layoutSetPrototype.getGroup();
	}

	public com.liferay.portal.model.LayoutSet getLayoutSet()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _layoutSetPrototype.getLayoutSet();
	}

	public LayoutSetPrototype getWrappedLayoutSetPrototype() {
		return _layoutSetPrototype;
	}

	private LayoutSetPrototype _layoutSetPrototype;
}