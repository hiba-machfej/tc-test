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

/**
 * Truncate given string down to max length
 * @param str String to be truncated
 * @param num Maximum length
 */
export function truncate(str: string, num: number): string {
  if (str && str.length > num) {
    return str.slice(0, num) + "...";
  } else {
    return str;
  }
}


export function isHtml(text): boolean {
  // Very simple test for HTML tags - isn't foolproof but probably good enough
  return /<\/?[a-z][\s\S]*>/i.test(text);
}
