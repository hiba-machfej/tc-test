/*
 * Copyright (c) 2023 Talent Beyond Boundaries.
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Affero General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see https://www.gnu.org/licenses/.
 */

package org.tctalent.server.request.search;

import org.tctalent.server.model.db.SavedSearchSubtype;
import org.tctalent.server.model.db.SavedSearchType;
import org.tctalent.server.request.candidate.source.SearchCandidateSourceRequestPaged;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SearchSavedSearchRequest extends SearchCandidateSourceRequestPaged {
    private SavedSearchType savedSearchType;
    private SavedSearchSubtype savedSearchSubtype;
}

