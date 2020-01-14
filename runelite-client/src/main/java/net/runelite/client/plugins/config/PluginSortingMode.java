package net.runelite.client.plugins.config;

public enum PluginSortingMode
{
	ALPHABETICAL
			{
				public String toString()
				{
					return "Alphabetical";
				}
			},
	CATEGORY
			{
				public String toString()
				{
					return "Category";
				}
			},
	STATUS
			{
				public String toString()
				{
					return "Status";
				}
			},
}
