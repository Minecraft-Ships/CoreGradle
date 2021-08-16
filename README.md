## Setup

Make sure Git is installed and path has been setup. If correctly setup the following command will work.

``git version``

with the returning value being something like

```git version x.x.x.y.x```

## Build Jars

Open a CLI (Terminal, CMD, etc.) to this project and then run the following command

``gradlew buildPlugin``

This will create the ships plugin for both Bukkit and Sponge. You will find the jar files inside the following folder.

``build/``