
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moretools.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.moretools.item.AmthystItem;
import net.mcreator.moretools.MoretoolsMod;

public class MoretoolsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MoretoolsMod.MODID);
	public static final RegistryObject<Item> AMETHYST_HELMET = REGISTRY.register("amethyst_helmet", () -> new AmthystItem.Helmet());
	public static final RegistryObject<Item> AMETHYST_CHESTPLATE = REGISTRY.register("amethyst_chestplate", () -> new AmthystItem.Chestplate());
	public static final RegistryObject<Item> AMETHYST_LEGGINGS = REGISTRY.register("amethyst_leggings", () -> new AmthystItem.Leggings());
	public static final RegistryObject<Item> AMETHYST_BOOTS = REGISTRY.register("amethyst_boots", () -> new AmthystItem.Boots());
}