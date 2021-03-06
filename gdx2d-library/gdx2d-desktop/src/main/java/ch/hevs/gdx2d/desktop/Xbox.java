/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package ch.hevs.gdx2d.desktop;

import com.badlogic.gdx.controllers.Controller;
import com.badlogic.gdx.utils.SharedLibraryLoader;

/**
 * Mappings for the Xbox series of controllers. Works only on desktop so far.
 *
 * See
 * <a href="https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/360_controller.svg/450px-360_controller.svg.png">
 * this image</a> which describes each button and axes.
 *
 * All codes are for buttons expect the L_STICK_XXX, R_STICK_XXX, L_BUMPER and R_BUMPER codes, which are axes.
 *
 * @author badlogic
 * @author Christopher Metrailler (mei)
 * @version 1.1
 */
public class Xbox {
	// Buttons
	public static final int A;
	public static final int B;
	public static final int X;
	public static final int Y;
	public static final int GUIDE;
	public static final int L_BUMPER;
	public static final int R_BUMPER;
	public static final int BACK;
	public static final int START;
	public static final int DPAD_UP;
	public static final int DPAD_DOWN;
	public static final int DPAD_LEFT;
	public static final int DPAD_RIGHT;

	// Axes
	/** left trigger, -1 if not pressed, 1 if pressed **/
	public static final int L_TRIGGER;
	/** right trigger, -1 if not pressed, 1 if pressed **/
	public static final int R_TRIGGER;
	/** left stick vertical axis, -1 if up, 1 if down **/
	public static final int L_STICK_VERTICAL_AXIS;
	/** left stick horizontal axis, -1 if left, 1 if right **/
	public static final int L_STICK_HORIZONTAL_AXIS;
	/** right stick vertical axis, -1 if up, 1 if down **/
	public static final int R_STICK_VERTICAL_AXIS;
	/** right stick horizontal axis, -1 if left, 1 if right **/
	public static final int R_STICK_HORIZONTAL_AXIS;

	static {
		if (SharedLibraryLoader.isWindows) {
			A = 0;
			B = 1;
			X = 2;
			Y = 3;
			GUIDE = -1; // Does not work
			L_BUMPER = 4;
			R_BUMPER = 5;
			BACK = 6;
			START = 7;

			DPAD_UP = -1; // Use directions instead
			DPAD_DOWN = -1;
			DPAD_LEFT = -1;
			DPAD_RIGHT = -1;

			L_TRIGGER = 4;
			R_TRIGGER = 5;
			L_STICK_VERTICAL_AXIS = 0;
			L_STICK_HORIZONTAL_AXIS = 1;
			R_STICK_VERTICAL_AXIS = 2;
			R_STICK_HORIZONTAL_AXIS = 3;
		} else if (SharedLibraryLoader.isLinux) {
			A = 0;
			B = 1;
			X = 2;
			Y = 3;
			GUIDE = -1;
			L_BUMPER = 9;
			R_BUMPER = 10;
			BACK = -1;
			START = -1;
			DPAD_UP = -1;
			DPAD_DOWN = -1;
			DPAD_LEFT = -1;
			DPAD_RIGHT = -1;
			L_TRIGGER = 4;
			R_TRIGGER = 5;
			L_STICK_VERTICAL_AXIS = 1;
			L_STICK_HORIZONTAL_AXIS = 0;
			R_STICK_VERTICAL_AXIS = 4;
			R_STICK_HORIZONTAL_AXIS = 3;
		} else if (SharedLibraryLoader.isMac) {
			A = 11;
			B = 12;
			X = 13;
			Y = 14;
			GUIDE = 10;
			L_BUMPER = 8;
			R_BUMPER = 9;
			BACK = 5;
			START = 4;
			DPAD_UP = 0;
			DPAD_DOWN = 1;
			DPAD_LEFT = 2;
			DPAD_RIGHT = 3;
			L_TRIGGER = 0;
			R_TRIGGER = 1;
			L_STICK_VERTICAL_AXIS = 3;
			L_STICK_HORIZONTAL_AXIS = 2;
			R_STICK_VERTICAL_AXIS = 5;
			R_STICK_HORIZONTAL_AXIS = 4;
		} else {
			A = -1;
			B = -1;
			X = -1;
			Y = -1;
			GUIDE = -1;
			L_BUMPER = -1;
			R_BUMPER = -1;
			L_TRIGGER = -1;
			R_TRIGGER = -1;
			BACK = -1;
			START = -1;
			DPAD_UP = -1;
			DPAD_DOWN = -1;
			DPAD_LEFT = -1;
			DPAD_RIGHT = -1;
			L_STICK_VERTICAL_AXIS = -1;
			L_STICK_HORIZONTAL_AXIS = -1;
			R_STICK_VERTICAL_AXIS = -1;
			R_STICK_HORIZONTAL_AXIS = -1;
		}
	}

	/**
	 * @return whether the {@link Controller} is an Xbox controller
	 */
	public static boolean isXboxController(Controller controller) {
		System.out.println(controller.getName());
		return controller.getName().toLowerCase().contains("xbox") || controller.getName().toLowerCase().contains("x-box");
	}
}
