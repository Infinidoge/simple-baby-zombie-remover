# Simple Baby Zombie Remover

Removes Baby Zombies. That's the entire mod. (Okay technically it only disables natural baby zombie spawning.)

Overrides `ZombieEntity`'s `shouldBeBaby` method to always return `false`.

## Known Incompatibilities
- SIHYWTCAMD: The mod spawns zombies in a way that forces zombies to be babies 50% of the time, instead of working with Minecraft's `shouldBeBaby` method.

## Complete Version
There is a version of this mod that prevents zombies from becoming babies entirely (through injecting into `setBaby` to not do anything.)
If you want to disable babies from spawning, for example in SIHYWTCAMD, use this version. Do note, however, that this will make it entirely impossible to spawn baby zombies, even through spawn eggs or commands.

See comment in mixin file for building the complete version.
