## Setup

Make sure Git is installed and path has been setup. If correctly setup the following command will work. 

``git version``

with the returning value being something like

```git version x.x.x.y.x```

### Actual Setup

If Git is setup correctly, then you will be able to run .sh files (Unix like O.S can typically run SH files without Git, however the script will crash if Git is not installed)

Run the file ``setup.sh``

This will clone all ships modules required for building of Ships. 

## Build Jars


Open a CLI (Terminal, CMD, etc.) to this project and then run the following command

``gradlew buildPlugin``

This will create the ships plugin for both Bukkit and Sponge.
You will find the jar files inside the following folder.

``build/``