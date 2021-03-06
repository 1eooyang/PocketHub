/*
 * Copyright (c) 2015 PocketHub
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.pockethub.android.ui.user;

import com.github.pockethub.android.ui.StyledText;
import com.github.pockethub.android.ui.view.OcticonTextView;
import com.meisolsson.githubsdk.model.GitHubEvent;
import com.meisolsson.githubsdk.model.payload.IssuesPayload;

public enum EventType {
    CommitCommentEvent {
        @Override
        public String generateIconAndFormatStyledText(IconAndViewTextManager iconAndViewTextManager, GitHubEvent event, StyledText main, StyledText details) {
            iconAndViewTextManager.formatCommitComment(event, main, details);
            return OcticonTextView.ICON_COMMENT;
        }
    },
    CreateEvent {
        @Override
        public String generateIconAndFormatStyledText(IconAndViewTextManager iconAndViewTextManager, GitHubEvent event, StyledText main, StyledText details) {
            iconAndViewTextManager.formatCreate(event, main, details);
            return OcticonTextView.ICON_CREATE;
        }
    },
    DeleteEvent {
        @Override
        public String generateIconAndFormatStyledText(IconAndViewTextManager iconAndViewTextManager, GitHubEvent event, StyledText main, StyledText details) {
            iconAndViewTextManager.formatDelete(event, main, details);
            return OcticonTextView.ICON_DELETE;
        }
    },
    DownloadEvent {
        @Override
        public String generateIconAndFormatStyledText(IconAndViewTextManager iconAndViewTextManager, GitHubEvent event, StyledText main, StyledText details) {
            iconAndViewTextManager.formatDownload(event, main, details);
            return OcticonTextView.ICON_UPLOAD;
        }
    },
    ReleaseEvent {
        @Override
        public String generateIconAndFormatStyledText(IconAndViewTextManager iconAndViewTextManager, GitHubEvent event, StyledText main, StyledText details) {
            iconAndViewTextManager.formatDownload(event, main, details);
            return OcticonTextView.ICON_UPLOAD;
        }
    },
    FollowEvent {
        @Override
        public String generateIconAndFormatStyledText(IconAndViewTextManager iconAndViewTextManager, GitHubEvent event, StyledText main, StyledText details) {
            iconAndViewTextManager.formatFollow(event, main, details);
            return OcticonTextView.ICON_FOLLOW;
        }
    },
    ForkEvent {
        @Override
        public String generateIconAndFormatStyledText(IconAndViewTextManager iconAndViewTextManager, GitHubEvent event, StyledText main, StyledText details) {
            iconAndViewTextManager.formatFork(event, main, details);
            return OcticonTextView.ICON_FORK;
        }
    },
    GistEvent {
        @Override
        public String generateIconAndFormatStyledText(IconAndViewTextManager iconAndViewTextManager, GitHubEvent event, StyledText main, StyledText details) {
            iconAndViewTextManager.formatGist(event, main, details);
            return OcticonTextView.ICON_GIST;
        }
    },
    GollumEvent {
        @Override
        public String generateIconAndFormatStyledText(IconAndViewTextManager iconAndViewTextManager, GitHubEvent event, StyledText main, StyledText details) {
            iconAndViewTextManager.formatWiki(event, main, details);
            return OcticonTextView.ICON_WIKI;
        }
    },
    IssueCommentEvent {
        @Override
        public String generateIconAndFormatStyledText(IconAndViewTextManager iconAndViewTextManager, GitHubEvent event, StyledText main, StyledText details) {
            iconAndViewTextManager.formatIssueComment(event, main, details);
            return OcticonTextView.ICON_ISSUE_COMMENT;
        }
    },
    IssuesEvent {
        @Override
        public String generateIconAndFormatStyledText(IconAndViewTextManager iconAndViewTextManager, GitHubEvent event, StyledText main, StyledText details) {
            iconAndViewTextManager.formatIssues(event, main, details);

            String action = ((IssuesPayload) event.payload()).action();
            String icon = null;
            if (IconAndViewTextManager.ISSUES_PAYLOAD_ACTION_OPENED.equals(action)) {
                icon = OcticonTextView.ICON_ISSUE_OPEN;
            } else if (IconAndViewTextManager.ISSUES_PAYLOAD_ACTION_REOPENED.equals(action)) {
                icon = OcticonTextView.ICON_ISSUE_REOPEN;
            } else if (IconAndViewTextManager.ISSUES_PAYLOAD_ACTION_CLOSED.equals(action)) {
                icon = OcticonTextView.ICON_ISSUE_CLOSE;
            }
            return icon;
        }
    },
    MemberEvent {
        @Override
        public String generateIconAndFormatStyledText(IconAndViewTextManager iconAndViewTextManager, GitHubEvent event, StyledText main, StyledText details) {
            iconAndViewTextManager.formatAddMember(event, main, details);
            return OcticonTextView.ICON_ADD_MEMBER;
        }
    },
    PublicEvent {
        @Override
        public String generateIconAndFormatStyledText(IconAndViewTextManager iconAndViewTextManager, GitHubEvent event, StyledText main, StyledText details) {
            iconAndViewTextManager.formatPublic(event, main, details);
            return null;
        }
    },
    PullRequestEvent {
        @Override
        public String generateIconAndFormatStyledText(IconAndViewTextManager iconAndViewTextManager, GitHubEvent event, StyledText main, StyledText details) {
            iconAndViewTextManager.formatPullRequest(event, main, details);
            return OcticonTextView.ICON_PULL_REQUEST;
        }
    },
    PullRequestReviewCommentEvent {
        @Override
        public String generateIconAndFormatStyledText(IconAndViewTextManager iconAndViewTextManager, GitHubEvent event, StyledText main, StyledText details) {
            iconAndViewTextManager.formatReviewComment(event, main, details);
            return OcticonTextView.ICON_COMMENT;
        }
    },
    PushEvent {
        @Override
        public String generateIconAndFormatStyledText(IconAndViewTextManager iconAndViewTextManager, GitHubEvent event, StyledText main, StyledText details) {
            iconAndViewTextManager.formatPush(event, main, details);
            return OcticonTextView.ICON_PUSH;
        }
    },
    TeamAddEvent {
        @Override
        public String generateIconAndFormatStyledText(IconAndViewTextManager iconAndViewTextManager, GitHubEvent event, StyledText main, StyledText details) {
            iconAndViewTextManager.formatTeamAdd(event, main, details);
            return OcticonTextView.ICON_ADD_MEMBER;
        }
    },
    WatchEvent {
        @Override
        public String generateIconAndFormatStyledText(IconAndViewTextManager iconAndViewTextManager, GitHubEvent event, StyledText main, StyledText details) {
            iconAndViewTextManager.formatWatch(event, main, details);
            return OcticonTextView.ICON_STAR;
        }
    };

    public abstract String generateIconAndFormatStyledText(IconAndViewTextManager iconAndViewTextManager, GitHubEvent event, StyledText main, StyledText details);
}
