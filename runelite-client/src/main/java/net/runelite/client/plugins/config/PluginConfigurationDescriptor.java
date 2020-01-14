/*
 * Copyright (c) 2019 Abex
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.config;

import javax.annotation.Nullable;
import javax.swing.JMenuItem;
import lombok.Value;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigDescriptor;
import net.runelite.client.externalplugins.ExternalPluginManager;
import net.runelite.client.externalplugins.ExternalPluginManifest;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginCategory;
import net.runelite.client.util.LinkBrowser;

@Value
class PluginConfigurationDescriptor
{
	private final String name;
	private final String description;
	private final String[] tags;
	private final PluginCategory category;

	// Can be null if its not an actual plugin (RuneLite / ChatColors)
	@Nullable
	private final Plugin plugin;

	// Can be null if it has no more configuration than the on/off toggle
	@Nullable
	private final Config config;

	@Nullable
	private final ConfigDescriptor configDescriptor;

	boolean hasConfigurables()
	{
		return configDescriptor != null && !configDescriptor.getItems().stream().allMatch(item -> item.getItem().hidden());
	}

	/**
	 * Creates a menu item for linking to a support page for the plugin
	 *
	 * @return A {@link JMenuItem} which opens the plugin's wiki page URL in the browser when clicked
	 */
	@Nullable
	JMenuItem createSupportMenuItem()
	{
		ExternalPluginManifest mf = getExternalPluginManifest();
		if (mf != null)
		{
			if (mf.getSupport() == null)
			{
				return null;
			}

			JMenuItem menuItem = new JMenuItem("Support");
			menuItem.addActionListener(e -> LinkBrowser.browse(mf.getSupport().toString()));
			return menuItem;
		}

		JMenuItem menuItem = new JMenuItem("Wiki");
		menuItem.addActionListener(e -> LinkBrowser.browse("https://github.com/runelite/runelite/wiki/" + name.replace(' ', '-')));
		return menuItem;
	}

	@Nullable
	ExternalPluginManifest getExternalPluginManifest()
	{
		if (plugin == null)
		{
			return null;
		}

		return ExternalPluginManager.getExternalPluginManifest(plugin.getClass());
	}
}
