/*
This file is part of ZAX.

	ZAX is free software: you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.

	ZAX is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU General Public License for more details.

	You should have received a copy of the GNU General Public License
	along with ZAX.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.inovex.zabbixmobile.model;

import java.util.Collection;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "screens")
public class Screen implements Comparable<Screen> {

	/** Screen ID */
	public static final String COLUMN_SCREENID = "screenid";
	@DatabaseField(id = true, columnName = COLUMN_SCREENID)
	long id;
	/** Screen name */
	public static final String COLUMN_NAME = "name";
	@DatabaseField(columnName = COLUMN_NAME)
	String name;

	/** zabbix server */
	public static final String COLUMN_ZABBIXSERVER_ID = "zabbixserverid";
	@DatabaseField(columnName = COLUMN_ZABBIXSERVER_ID)
	private Long zabbixServerId;

	Collection<Graph> graphs;

	public Screen() {
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Collection<Graph> getGraphs() {
		return graphs;
	}

	public void setGraphs(Collection<Graph> graphs) {
		this.graphs = graphs;
	}

	public void setId(long screenId) {
		this.id = screenId;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Screen another) {
		if (another.getId() < id)
			return 1;
		if (another.getId() > id)
			return -1;
		return 0;
	}

	public Long getZabbixServerId() {
		return zabbixServerId;
	}

	public void setZabbixServerId(Long zabbixServerId) {
		this.zabbixServerId = zabbixServerId;
	}

}
