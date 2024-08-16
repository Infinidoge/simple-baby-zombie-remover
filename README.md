# Simple Baby Zombie Remover

Removes Baby Zombies. That's the entire mod.

- Simple: Overrides `ZombieEntity`'s `shouldBeBaby` method to always return `false`. This just prevents natural spawning.
- Complete: Overrides `ZombieEntity`'s `setBaby` method to do nothing. This removes baby zombies **entirely**.

## Known Incompatibilities
- SIHYWTCAMD: The mod spawns zombies in a way that forces zombies to be babies 50% of the time, instead of working with Minecraft's `shouldBeBaby` method. Use the Complete version.

## Building

To build the mod, run `./gradlew build`. To select the version, edit `variant` in `gradle.properties` to either `simple` or `complete` (Case sensitive.)

This edits the corresponding metadata files to load the right mixins.
