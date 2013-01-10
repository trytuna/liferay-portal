/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.RepositoryEntry;
import com.liferay.portal.model.RepositoryEntryModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the RepositoryEntry service. Represents a row in the &quot;RepositoryEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portal.model.RepositoryEntryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RepositoryEntryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RepositoryEntryImpl
 * @see com.liferay.portal.model.RepositoryEntry
 * @see com.liferay.portal.model.RepositoryEntryModel
 * @generated
 */
public class RepositoryEntryModelImpl extends BaseModelImpl<RepositoryEntry>
	implements RepositoryEntryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a repository entry model instance should use the {@link com.liferay.portal.model.RepositoryEntry} interface instead.
	 */
	public static final String TABLE_NAME = "RepositoryEntry";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "repositoryEntryId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "repositoryId", Types.BIGINT },
			{ "mappedId", Types.VARCHAR },
			{ "manualCheckInRequired", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table RepositoryEntry (uuid_ VARCHAR(75) null,repositoryEntryId LONG not null primary key,groupId LONG,repositoryId LONG,mappedId VARCHAR(75) null,manualCheckInRequired BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table RepositoryEntry";
	public static final String ORDER_BY_JPQL = " ORDER BY repositoryEntry.repositoryEntryId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY RepositoryEntry.repositoryEntryId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portal.model.RepositoryEntry"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portal.model.RepositoryEntry"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.column.bitmask.enabled.com.liferay.portal.model.RepositoryEntry"),
			true);
	public static long GROUPID_COLUMN_BITMASK = 1L;
	public static long MAPPEDID_COLUMN_BITMASK = 2L;
	public static long REPOSITORYID_COLUMN_BITMASK = 4L;
	public static long UUID_COLUMN_BITMASK = 8L;
	public static long REPOSITORYENTRYID_COLUMN_BITMASK = 16L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portal.model.RepositoryEntry"));

	public RepositoryEntryModelImpl() {
	}

	public long getPrimaryKey() {
		return _repositoryEntryId;
	}

	public void setPrimaryKey(long primaryKey) {
		setRepositoryEntryId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return _repositoryEntryId;
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return RepositoryEntry.class;
	}

	public String getModelClassName() {
		return RepositoryEntry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("repositoryEntryId", getRepositoryEntryId());
		attributes.put("groupId", getGroupId());
		attributes.put("repositoryId", getRepositoryId());
		attributes.put("mappedId", getMappedId());
		attributes.put("manualCheckInRequired", getManualCheckInRequired());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long repositoryEntryId = (Long)attributes.get("repositoryEntryId");

		if (repositoryEntryId != null) {
			setRepositoryEntryId(repositoryEntryId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long repositoryId = (Long)attributes.get("repositoryId");

		if (repositoryId != null) {
			setRepositoryId(repositoryId);
		}

		String mappedId = (String)attributes.get("mappedId");

		if (mappedId != null) {
			setMappedId(mappedId);
		}

		Boolean manualCheckInRequired = (Boolean)attributes.get(
				"manualCheckInRequired");

		if (manualCheckInRequired != null) {
			setManualCheckInRequired(manualCheckInRequired);
		}
	}

	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	public long getRepositoryEntryId() {
		return _repositoryEntryId;
	}

	public void setRepositoryEntryId(long repositoryEntryId) {
		_repositoryEntryId = repositoryEntryId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	public long getRepositoryId() {
		return _repositoryId;
	}

	public void setRepositoryId(long repositoryId) {
		_columnBitmask |= REPOSITORYID_COLUMN_BITMASK;

		if (!_setOriginalRepositoryId) {
			_setOriginalRepositoryId = true;

			_originalRepositoryId = _repositoryId;
		}

		_repositoryId = repositoryId;
	}

	public long getOriginalRepositoryId() {
		return _originalRepositoryId;
	}

	public String getMappedId() {
		if (_mappedId == null) {
			return StringPool.BLANK;
		}
		else {
			return _mappedId;
		}
	}

	public void setMappedId(String mappedId) {
		_columnBitmask |= MAPPEDID_COLUMN_BITMASK;

		if (_originalMappedId == null) {
			_originalMappedId = _mappedId;
		}

		_mappedId = mappedId;
	}

	public String getOriginalMappedId() {
		return GetterUtil.getString(_originalMappedId);
	}

	public boolean getManualCheckInRequired() {
		return _manualCheckInRequired;
	}

	public boolean isManualCheckInRequired() {
		return _manualCheckInRequired;
	}

	public void setManualCheckInRequired(boolean manualCheckInRequired) {
		_manualCheckInRequired = manualCheckInRequired;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			RepositoryEntry.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public RepositoryEntry toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (RepositoryEntry)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		RepositoryEntryImpl repositoryEntryImpl = new RepositoryEntryImpl();

		repositoryEntryImpl.setUuid(getUuid());
		repositoryEntryImpl.setRepositoryEntryId(getRepositoryEntryId());
		repositoryEntryImpl.setGroupId(getGroupId());
		repositoryEntryImpl.setRepositoryId(getRepositoryId());
		repositoryEntryImpl.setMappedId(getMappedId());
		repositoryEntryImpl.setManualCheckInRequired(getManualCheckInRequired());

		repositoryEntryImpl.resetOriginalValues();

		return repositoryEntryImpl;
	}

	public int compareTo(RepositoryEntry repositoryEntry) {
		long primaryKey = repositoryEntry.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		RepositoryEntry repositoryEntry = null;

		try {
			repositoryEntry = (RepositoryEntry)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = repositoryEntry.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		RepositoryEntryModelImpl repositoryEntryModelImpl = this;

		repositoryEntryModelImpl._originalUuid = repositoryEntryModelImpl._uuid;

		repositoryEntryModelImpl._originalGroupId = repositoryEntryModelImpl._groupId;

		repositoryEntryModelImpl._setOriginalGroupId = false;

		repositoryEntryModelImpl._originalRepositoryId = repositoryEntryModelImpl._repositoryId;

		repositoryEntryModelImpl._setOriginalRepositoryId = false;

		repositoryEntryModelImpl._originalMappedId = repositoryEntryModelImpl._mappedId;

		repositoryEntryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<RepositoryEntry> toCacheModel() {
		RepositoryEntryCacheModel repositoryEntryCacheModel = new RepositoryEntryCacheModel();

		repositoryEntryCacheModel.uuid = getUuid();

		String uuid = repositoryEntryCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			repositoryEntryCacheModel.uuid = null;
		}

		repositoryEntryCacheModel.repositoryEntryId = getRepositoryEntryId();

		repositoryEntryCacheModel.groupId = getGroupId();

		repositoryEntryCacheModel.repositoryId = getRepositoryId();

		repositoryEntryCacheModel.mappedId = getMappedId();

		String mappedId = repositoryEntryCacheModel.mappedId;

		if ((mappedId != null) && (mappedId.length() == 0)) {
			repositoryEntryCacheModel.mappedId = null;
		}

		repositoryEntryCacheModel.manualCheckInRequired = getManualCheckInRequired();

		return repositoryEntryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", repositoryEntryId=");
		sb.append(getRepositoryEntryId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", repositoryId=");
		sb.append(getRepositoryId());
		sb.append(", mappedId=");
		sb.append(getMappedId());
		sb.append(", manualCheckInRequired=");
		sb.append(getManualCheckInRequired());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portal.model.RepositoryEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>repositoryEntryId</column-name><column-value><![CDATA[");
		sb.append(getRepositoryEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>repositoryId</column-name><column-value><![CDATA[");
		sb.append(getRepositoryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mappedId</column-name><column-value><![CDATA[");
		sb.append(getMappedId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>manualCheckInRequired</column-name><column-value><![CDATA[");
		sb.append(getManualCheckInRequired());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = RepositoryEntry.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			RepositoryEntry.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _repositoryEntryId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _repositoryId;
	private long _originalRepositoryId;
	private boolean _setOriginalRepositoryId;
	private String _mappedId;
	private String _originalMappedId;
	private boolean _manualCheckInRequired;
	private long _columnBitmask;
	private RepositoryEntry _escapedModel;
}