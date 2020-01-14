package net.runelite.client.plugins;

public enum PluginCategory
{
	GENERAL
			{
				public String toString()
				{
					return "General";
				}
			},
	DISPLAY
			{
				public String toString()
				{
					return "Display";
				}
			},
	OTHER
			{
				public String toString()
				{
					return "Other";
				}
			},
}
