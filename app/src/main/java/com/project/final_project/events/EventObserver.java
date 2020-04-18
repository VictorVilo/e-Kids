package com.project.final_project.events;

import com.project.final_project.events.engine.FlipDownCardsEvent;
import com.project.final_project.events.engine.GameWonEvent;
import com.project.final_project.events.engine.HidePairCardsEvent;
import com.project.final_project.events.ui.BackGameEvent;
import com.project.final_project.events.ui.DifficultySelectedEvent;
import com.project.final_project.events.ui.FlipCardEvent;
import com.project.final_project.events.ui.NextGameEvent;
import com.project.final_project.events.ui.ResetBackgroundEvent;
import com.project.final_project.events.ui.StartEvent;
import com.project.final_project.events.ui.ThemeSelectedEvent;


public interface EventObserver {

	void onEvent(FlipCardEvent event);

	void onEvent(DifficultySelectedEvent event);

	void onEvent(HidePairCardsEvent event);

	void onEvent(FlipDownCardsEvent event);

	void onEvent(StartEvent event);

	void onEvent(ThemeSelectedEvent event);

	void onEvent(GameWonEvent event);

	void onEvent(BackGameEvent event);

	void onEvent(NextGameEvent event);

	void onEvent(ResetBackgroundEvent event);

}
