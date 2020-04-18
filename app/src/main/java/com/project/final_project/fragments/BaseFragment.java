package com.project.final_project.fragments;


import androidx.fragment.app.Fragment;

import com.project.final_project.events.EventObserver;
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

public class BaseFragment extends Fragment implements EventObserver {

	@Override
	public void onEvent(FlipCardEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(DifficultySelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(HidePairCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(FlipDownCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(StartEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ThemeSelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(GameWonEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(BackGameEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(NextGameEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ResetBackgroundEvent event) {
		throw new UnsupportedOperationException();
	}

}
