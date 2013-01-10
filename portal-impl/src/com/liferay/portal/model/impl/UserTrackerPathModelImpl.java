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
import com.liferay.portal.model.UserTrackerPath;
import com.liferay.portal.model.UserTrackerPathModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the UserTrackerPath service. Represents a row in the &quot;UserTrackerPath&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portal.model.UserTrackerPathModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserTrackerPathImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserTrackerPathImpl
 * @see com.liferay.portal.model.UserTrackerPath
 * @see com.liferay.portal.model.UserTrackerPathModel
 * @generated
 */
public class UserTrackerPathModelImpl extends BaseModelImpl<UserTrackerPath>
	implements UserTrackerPathModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a user tracker path model instance should use the {@link com.liferay.portal.model.UserTrackerPath} interface instead.
	 */
	public static final String TABLE_NAME = "UserTrackerPath";
	public static final Object[][] TABLE_COLUMNS = {
			{ "userTrackerPathId", Types.BIGINT },
			{ "userTrackerId", Types.BIGINT },
			{ "path_", Types.VARCHAR },
			{ "pathDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table UserTrackerPath (userTrackerPathId LONG not null primary key,userTrackerId LONG,path_ STRING null,pathDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table UserTrackerPath";
	public static final String ORDER_BY_JPQL = " ORDER BY userTrackerPath.userTrackerPathId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY UserTrackerPath.userTrackerPathId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portal.model.UserTrackerPath"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portal.model.UserTrackerPath"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.column.bitmask.enabled.com.liferay.portal.model.UserTrackerPath"),
			true);
	public static long USERTRACKERID_COLUMN_BITMASK = 1L;
	public static long USERTRACKERPATHID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portal.model.UserTrackerPath"));

	public UserTrackerPathModelImpl() {
	}

	public long getPrimaryKey() {
		return _userTrackerPathId;
	}

	public void setPrimaryKey(long primaryKey) {
		setUserTrackerPathId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return _userTrackerPathId;
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return UserTrackerPath.class;
	}

	public String getModelClassName() {
		return UserTrackerPath.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userTrackerPathId", getUserTrackerPathId());
		attributes.put("userTrackerId", getUserTrackerId());
		attributes.put("path", getPath());
		attributes.put("pathDate", getPathDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userTrackerPathId = (Long)attributes.get("userTrackerPathId");

		if (userTrackerPathId != null) {
			setUserTrackerPathId(userTrackerPathId);
		}

		Long userTrackerId = (Long)attributes.get("userTrackerId");

		if (userTrackerId != null) {
			setUserTrackerId(userTrackerId);
		}

		String path = (String)attributes.get("path");

		if (path != null) {
			setPath(path);
		}

		Date pathDate = (Date)attributes.get("pathDate");

		if (pathDate != null) {
			setPathDate(pathDate);
		}
	}

	public long getUserTrackerPathId() {
		return _userTrackerPathId;
	}

	public void setUserTrackerPathId(long userTrackerPathId) {
		_userTrackerPathId = userTrackerPathId;
	}

	public long getUserTrackerId() {
		return _userTrackerId;
	}

	public void setUserTrackerId(long userTrackerId) {
		_columnBitmask |= USERTRACKERID_COLUMN_BITMASK;

		if (!_setOriginalUserTrackerId) {
			_setOriginalUserTrackerId = true;

			_originalUserTrackerId = _userTrackerId;
		}

		_userTrackerId = userTrackerId;
	}

	public long getOriginalUserTrackerId() {
		return _originalUserTrackerId;
	}

	public String getPath() {
		if (_path == null) {
			return StringPool.BLANK;
		}
		else {
			return _path;
		}
	}

	public void setPath(String path) {
		_path = path;
	}

	public Date getPathDate() {
		return _pathDate;
	}

	public void setPathDate(Date pathDate) {
		_pathDate = pathDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			UserTrackerPath.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public UserTrackerPath toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (UserTrackerPath)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		UserTrackerPathImpl userTrackerPathImpl = new UserTrackerPathImpl();

		userTrackerPathImpl.setUserTrackerPathId(getUserTrackerPathId());
		userTrackerPathImpl.setUserTrackerId(getUserTrackerId());
		userTrackerPathImpl.setPath(getPath());
		userTrackerPathImpl.setPathDate(getPathDate());

		userTrackerPathImpl.resetOriginalValues();

		return userTrackerPathImpl;
	}

	public int compareTo(UserTrackerPath userTrackerPath) {
		long primaryKey = userTrackerPath.getPrimaryKey();

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

		UserTrackerPath userTrackerPath = null;

		try {
			userTrackerPath = (UserTrackerPath)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = userTrackerPath.getPrimaryKey();

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
		UserTrackerPathModelImpl userTrackerPathModelImpl = this;

		userTrackerPathModelImpl._originalUserTrackerId = userTrackerPathModelImpl._userTrackerId;

		userTrackerPathModelImpl._setOriginalUserTrackerId = false;

		userTrackerPathModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<UserTrackerPath> toCacheModel() {
		UserTrackerPathCacheModel userTrackerPathCacheModel = new UserTrackerPathCacheModel();

		userTrackerPathCacheModel.userTrackerPathId = getUserTrackerPathId();

		userTrackerPathCacheModel.userTrackerId = getUserTrackerId();

		userTrackerPathCacheModel.path = getPath();

		String path = userTrackerPathCacheModel.path;

		if ((path != null) && (path.length() == 0)) {
			userTrackerPathCacheModel.path = null;
		}

		Date pathDate = getPathDate();

		if (pathDate != null) {
			userTrackerPathCacheModel.pathDate = pathDate.getTime();
		}
		else {
			userTrackerPathCacheModel.pathDate = Long.MIN_VALUE;
		}

		return userTrackerPathCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{userTrackerPathId=");
		sb.append(getUserTrackerPathId());
		sb.append(", userTrackerId=");
		sb.append(getUserTrackerId());
		sb.append(", path=");
		sb.append(getPath());
		sb.append(", pathDate=");
		sb.append(getPathDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portal.model.UserTrackerPath");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userTrackerPathId</column-name><column-value><![CDATA[");
		sb.append(getUserTrackerPathId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userTrackerId</column-name><column-value><![CDATA[");
		sb.append(getUserTrackerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>path</column-name><column-value><![CDATA[");
		sb.append(getPath());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pathDate</column-name><column-value><![CDATA[");
		sb.append(getPathDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = UserTrackerPath.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			UserTrackerPath.class
		};
	private long _userTrackerPathId;
	private long _userTrackerId;
	private long _originalUserTrackerId;
	private boolean _setOriginalUserTrackerId;
	private String _path;
	private Date _pathDate;
	private long _columnBitmask;
	private UserTrackerPath _escapedModel;
}