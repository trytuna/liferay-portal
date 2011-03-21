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

package com.liferay.portlet.journal.model;

/**
 * <p>
 * This class is a wrapper for {@link JournalArticleImage}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       JournalArticleImage
 * @generated
 */
public class JournalArticleImageWrapper implements JournalArticleImage {
	public JournalArticleImageWrapper(JournalArticleImage journalArticleImage) {
		_journalArticleImage = journalArticleImage;
	}

	public Class<?> getModelClass() {
		return JournalArticleImage.class;
	}

	public String getModelClassName() {
		return JournalArticleImage.class.getName();
	}

	/**
	* Gets the primary key of this journal article image.
	*
	* @return the primary key of this journal article image
	*/
	public long getPrimaryKey() {
		return _journalArticleImage.getPrimaryKey();
	}

	/**
	* Sets the primary key of this journal article image
	*
	* @param pk the primary key of this journal article image
	*/
	public void setPrimaryKey(long pk) {
		_journalArticleImage.setPrimaryKey(pk);
	}

	/**
	* Gets the article image ID of this journal article image.
	*
	* @return the article image ID of this journal article image
	*/
	public long getArticleImageId() {
		return _journalArticleImage.getArticleImageId();
	}

	/**
	* Sets the article image ID of this journal article image.
	*
	* @param articleImageId the article image ID of this journal article image
	*/
	public void setArticleImageId(long articleImageId) {
		_journalArticleImage.setArticleImageId(articleImageId);
	}

	/**
	* Gets the group ID of this journal article image.
	*
	* @return the group ID of this journal article image
	*/
	public long getGroupId() {
		return _journalArticleImage.getGroupId();
	}

	/**
	* Sets the group ID of this journal article image.
	*
	* @param groupId the group ID of this journal article image
	*/
	public void setGroupId(long groupId) {
		_journalArticleImage.setGroupId(groupId);
	}

	/**
	* Gets the article ID of this journal article image.
	*
	* @return the article ID of this journal article image
	*/
	public java.lang.String getArticleId() {
		return _journalArticleImage.getArticleId();
	}

	/**
	* Sets the article ID of this journal article image.
	*
	* @param articleId the article ID of this journal article image
	*/
	public void setArticleId(java.lang.String articleId) {
		_journalArticleImage.setArticleId(articleId);
	}

	/**
	* Gets the version of this journal article image.
	*
	* @return the version of this journal article image
	*/
	public double getVersion() {
		return _journalArticleImage.getVersion();
	}

	/**
	* Sets the version of this journal article image.
	*
	* @param version the version of this journal article image
	*/
	public void setVersion(double version) {
		_journalArticleImage.setVersion(version);
	}

	/**
	* Gets the el instance ID of this journal article image.
	*
	* @return the el instance ID of this journal article image
	*/
	public java.lang.String getElInstanceId() {
		return _journalArticleImage.getElInstanceId();
	}

	/**
	* Sets the el instance ID of this journal article image.
	*
	* @param elInstanceId the el instance ID of this journal article image
	*/
	public void setElInstanceId(java.lang.String elInstanceId) {
		_journalArticleImage.setElInstanceId(elInstanceId);
	}

	/**
	* Gets the el name of this journal article image.
	*
	* @return the el name of this journal article image
	*/
	public java.lang.String getElName() {
		return _journalArticleImage.getElName();
	}

	/**
	* Sets the el name of this journal article image.
	*
	* @param elName the el name of this journal article image
	*/
	public void setElName(java.lang.String elName) {
		_journalArticleImage.setElName(elName);
	}

	/**
	* Gets the language ID of this journal article image.
	*
	* @return the language ID of this journal article image
	*/
	public java.lang.String getLanguageId() {
		return _journalArticleImage.getLanguageId();
	}

	/**
	* Sets the language ID of this journal article image.
	*
	* @param languageId the language ID of this journal article image
	*/
	public void setLanguageId(java.lang.String languageId) {
		_journalArticleImage.setLanguageId(languageId);
	}

	/**
	* Gets the temp image of this journal article image.
	*
	* @return the temp image of this journal article image
	*/
	public boolean getTempImage() {
		return _journalArticleImage.getTempImage();
	}

	/**
	* Determines if this journal article image is temp image.
	*
	* @return <code>true</code> if this journal article image is temp image; <code>false</code> otherwise
	*/
	public boolean isTempImage() {
		return _journalArticleImage.isTempImage();
	}

	/**
	* Sets whether this journal article image is temp image.
	*
	* @param tempImage the temp image of this journal article image
	*/
	public void setTempImage(boolean tempImage) {
		_journalArticleImage.setTempImage(tempImage);
	}

	public boolean isNew() {
		return _journalArticleImage.isNew();
	}

	public void setNew(boolean n) {
		_journalArticleImage.setNew(n);
	}

	public boolean isCachedModel() {
		return _journalArticleImage.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_journalArticleImage.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _journalArticleImage.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_journalArticleImage.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _journalArticleImage.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _journalArticleImage.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_journalArticleImage.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return new JournalArticleImageWrapper((JournalArticleImage)_journalArticleImage.clone());
	}

	public int compareTo(
		com.liferay.portlet.journal.model.JournalArticleImage journalArticleImage) {
		return _journalArticleImage.compareTo(journalArticleImage);
	}

	public int hashCode() {
		return _journalArticleImage.hashCode();
	}

	public com.liferay.portlet.journal.model.JournalArticleImage toEscapedModel() {
		return new JournalArticleImageWrapper(_journalArticleImage.toEscapedModel());
	}

	public java.lang.String toString() {
		return _journalArticleImage.toString();
	}

	public java.lang.String toXmlString() {
		return _journalArticleImage.toXmlString();
	}

	public JournalArticleImage getWrappedJournalArticleImage() {
		return _journalArticleImage;
	}

	private JournalArticleImage _journalArticleImage;
}