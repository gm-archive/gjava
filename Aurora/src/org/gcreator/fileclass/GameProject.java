/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.fileclass;

import java.io.File;
import org.gcreator.fileclass.groups.SceneGroup;
import org.gcreator.fileclass.groups.PathGroup;
import org.gcreator.fileclass.groups.SnippetGroup;
import org.gcreator.fileclass.groups.SoundGroup;
import org.gcreator.fileclass.groups.GCLGroup;
import org.gcreator.fileclass.groups.ActorGroup;
import org.gcreator.fileclass.groups.SpriteGroup;
import org.gcreator.fileclass.groups.TilesetGroup;
import org.gcreator.fileclass.groups.TimelineGroup;
import org.gcreator.fileclass.groups.ImageGroup;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.ImageIcon;
import org.gcreator.components.ProjectTypes;
import org.gcreator.units.ObjectNode;

/**
 *
 * @author Luís
 */
public class GameProject extends Project {

    private static final long serialVersionUID = 1;
    public int images = 1;
    public int sprites = 1;
    public int tilesets = 1;
    public int paths = 1;
    public int sounds = 1;
    public int timelines = 1;
    public int actors = 1;
    public int scenes = 1;
    public int classes = 1;
    public int scripts = 1;
    public int snippets = 1;
    public GFile info;

    public GameProject(String name, File location) {
        super(name, location);
        project_game = new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/new_game_sm.png"));
    }

    public GameProject() {
        project_game = new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/new_game_sm.png"));
    }

    public GameProject(String name, File location, ImageIcon img) {
        super(name, location);
        project_game = img;
    }

    public GameProject(ImageIcon img) {
        project_game = img;
    }

    @Override
    public String getType() {
        return "Game";
    }

    public static GameProject balance() {
        return balance(ProjectTypes.EMPTY_GAME);
    }

    public static GameProject balance(int projectType) {
        return (GameProject) balancedCreation(projectType);
    }

    @Override
    public Enumeration getEnum(String key) {
        Enumeration e = null;
        if (key.equals("actor")) {
            e = node.getChildAt(6).children();
        } else if (key.equals("scene")) {
            e = node.getChildAt(7).children();
        } else if (key.equals("timeline")) {
            e = node.getChildAt(5).children();
        } else if (key.equals("image")) {
            e = node.getChildAt(0).children();
        } else if (key.equals("sprite")) {
            e = node.getChildAt(1).children();
        } else if (key.equals("tileset")) {
            e = node.getChildAt(2).children();
        } else if (key.equals("sound")) {
            e = node.getChildAt(4).children();
        } else if (key.equals("class")) {
            e = node.getChildAt(8).children();
        } else if (key.equals("path")) {
            e = node.getChildAt(3).children();
        } else if (key.equals("snippet")) {
            e = node.getChildAt(9).children();
        }
        return e;
    }

    @Override
    public Folder getFolderFor(String key) {
        if (key.equals("actor")) {
            return (Folder) ((ObjectNode) node.getChildAt(6)).object;
        } else if (key.equals("scene")) {
            return (Folder) ((ObjectNode) node.getChildAt(7)).object;
        } else if (key.equals("timeline")) {
            return (Folder) ((ObjectNode) node.getChildAt(5)).object;
        } else if (key.equals("image")) {
            return (Folder) ((ObjectNode) node.getChildAt(0)).object;
        } else if (key.equals("sprite")) {
            return (Folder) ((ObjectNode) node.getChildAt(1)).object;
        } else if (key.equals("tileset")) {
            return (Folder) ((ObjectNode) node.getChildAt(2)).object;
        } else if (key.equals("sound")) {
            return (Folder) ((ObjectNode) node.getChildAt(4)).object;
        } else if (key.equals("class")) {
            return (Folder) ((ObjectNode) node.getChildAt(8)).object;
        } else if (key.equals("path")) {
            return (Folder) ((ObjectNode) node.getChildAt(3)).object;
        } else if (key.equals("snippet")) {
            return (Folder) ((ObjectNode) node.getChildAt(9)).object;
        }
        return null;
    }

    @Override
    public boolean validOfType(GObject obj, String key) {
        Vector<GObject> v = childNodes;
        if (key.equals("parent")) {
            return v.contains(obj);
        } else if (v.contains(obj)) {
            return false;
        }
        //TODO: Find some way to exclude all distribution files and groups
        //unless key is 'distro'
        //
        // EDIT: Is this done?
        //
        if (obj instanceof GFile) {
            GFile f = (GFile) obj;
            if (f.type.equals("actor") || f.type.equals("scene") || f.type.equals("timeline") || f.type.equals("sprite") || f.type.equals("tileset")) {
                return key.equals(f.type);
            }
            if (key.equals("image")) {
                return f.type.equals("png") || f.type.equals("gif") || f.type.equals("jpg");
            }
            if (key.equals("class")) {
                return f.type.equals("egml") || f.type.equals("gcl") || f.type.equals("struct") || f.type.equals("gs");
            }
            return false;
        } else if (obj instanceof Group) {
            if (key.equals("actor")) {
                return obj instanceof ActorGroup;
            }
            if (key.equals("scene")) {
                return obj instanceof SceneGroup;
            }
            if (key.equals("sprite")) {
                return obj instanceof SpriteGroup;
            }
            if (key.equals("timeline")) {
                return obj instanceof TimelineGroup;
            }
            if (key.equals("tileset")) {
                return obj instanceof TilesetGroup;
            }
            if (key.equals("image")) {
                return obj instanceof ImageGroup;
            }
            if (key.equals("class")) {
                return obj instanceof GCLGroup;
            }
            if (key.equals("sound")) {
                return obj instanceof SoundGroup;
            }
            if (key.equals("path")) {
                return obj instanceof PathGroup;
            }
            if (key.equals("snippet")) {
                return obj instanceof SnippetGroup;
            }
        }
        return false;
    }

    @Override
    public Folder magicAddition(String file) {
        try {
            if (file.equals("png") || file.equals("gif") || file.equals("jpg")) {
                return findFolder("$workspace-game-image");
            } else if (file.equals("sprite")) {
                return findFolder("$workspace-game-sprite");
            } else if (file.equals("tileset")) {
                return findFolder("$workspace-game-tileset");
            } else if (file.equals("actor")) {
                return findFolder("$workspace-game-actor");
            } else if (file.equals("scene")) {
                return findFolder("$workspace-game-scene");
            } else if (file.equals("egml") || file.equals("gcl") || file.equals("struct") || file.equals("gs")) {
                return findFolder("$workspace-game-script");
            } else if (file.equals("mp3") || file.equals("ogg") || file.equals("wav") || file.equals("mid") || file.equals("midi")) {
                return findFolder("$workspace-game-sound");
            } else if (file.equals("timeline")) {
                return findFolder("$workspace-game-timeline");
            } else if (file.equals("path")) {
                return findFolder("$workspace-game-path");
            } else if (file.equals("snippet")) {
                return findFolder("Snippets");
            }
            return findFolder("$workspace-game-distribution");
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Folder magicAddition(Group folder) {
        try {
            if (folder instanceof ImageGroup) {
                return findFolder("$workspace-game-image");
            } else if (folder instanceof SpriteGroup) {
                return findFolder("$workspace-game-sprite");
            } else if (folder instanceof ActorGroup) {
                return findFolder("$workspace-game-actor");
            } else if (folder instanceof SceneGroup) {
                return findFolder("$workspace-game-scene");
            } else if (folder instanceof TilesetGroup) {
                return findFolder("$workspace-game-tileset");
            } else if (folder instanceof SoundGroup) {
                return findFolder("$workspace-game-sound");
            } else if (folder instanceof TimelineGroup) {
                return findFolder("$workspace-game-timeline");
            } else if (folder instanceof PathGroup) {
                return findFolder("$workspace-game-path");
            } else if (folder instanceof GCLGroup) {
                return findFolder("$workspace-game-script");
            }
            return findFolder("$workspace-game-distribution");
        } catch (Exception e) {
            return null;
        }
    }

    private static Project balancedCreation(int projectType) {
        GameProject project;
        if (projectType == ProjectTypes.RPG_GAME) {
            project = new GameProject(new ImageIcon(GameProject.class.getResource(
                    "/org/gcreator/resources/toolbar/new_rpg_sm.png")));
        } else if (projectType == ProjectTypes.PLATFORM_GAME) {
            project = new GameProject(new ImageIcon(GameProject.class.getResource(
                    "/org/gcreator/resources/toolbar/new_platform_sm.png")));
        } else if (projectType == ProjectTypes.AIR_BATTLE) {
            project = new GameProject(new ImageIcon(GameProject.class.getResource(
                    "/org/gcreator/resources/toolbar/new_airbattle_sm.png")));
        } else {
            project = new GameProject();
        }

        project.add(new ImageGroup(project, "$workspace-game-image"));
        project.add(new SpriteGroup(project, "$workspace-game-sprite"));
        project.add(new TilesetGroup(project, "$workspace-game-tileset"));
        project.add(new PathGroup(project, "$workspace-game-path"));
        project.add(new SoundGroup(project, "$workspace-game-sound"));
        project.add(new TimelineGroup(project, "$workspace-game-timeline"));
        project.add(new ActorGroup(project, "$workspace-game-actor"));
        project.add(new SceneGroup(project, "$workspace-game-scene"));
        project.add(new GCLGroup(project, "$workspace-game-script"));
// <don't erase>  project.add(new SnippetGroup(project, "Snippets"));
        project.add(new Group(project, "$workspace-game-distribution"));
        GFile settings = new GFile(project, "$workspace-game-settings", "settings", null);
        settings.editable = false;
        settings.value = new org.gcreator.fileclass.res.SettingsValues();
        project.info = new GFile(project, "$workspace-game-info", "rtf", null);
        project.info.editable = false;

        for (GObject o : project.childNodes) {
            o.allowDrag = false;
        }
        return project;
    }

    @Override
    public boolean allowsFileType(String format) {
        return false;
    }

    @Override
    public boolean allowsGroup(Group group) {
        return false;
    }

    @Override
    public Group newGroup(String name) {
        return null;
    }

    @Override
    public boolean allowsDelete(GObject o) {
        return false;
    }

    @Override
    public String getObjectType() {
        return "GameProject";
    }
    private final ImageIcon project_game;

    @Override
    public ImageIcon getImage() {
        return project_game;
    }
}
