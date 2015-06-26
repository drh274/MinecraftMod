package com.drh.mm;

import com.drh.mm.proxy.IProxy;
import com.drh.mm.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class MinecraftMod{
    @Mod.Instance(Reference.MOD_ID)
    public static MinecraftMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        //Network Handling, mod configuration, initialize items/blocks
        //Pre-init for all mods occurs before init
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        //Register GUIs, tile entities, crafting recipes
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        //
    }

}
