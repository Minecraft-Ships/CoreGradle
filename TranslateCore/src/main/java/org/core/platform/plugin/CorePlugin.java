package org.core.platform.plugin;

import org.core.command.CommandRegister;
import org.core.platform.plugin.details.CorePluginVersion;
import org.jetbrains.annotations.NotNull;

public interface CorePlugin extends Plugin {

    void onConstruct(@NotNull Object pluginLauncher);

    void onRegisterCommands(@NotNull CommandRegister register);

    @NotNull String getLicence();


    @Override
    @NotNull
    CorePluginVersion getPluginVersion();
}
